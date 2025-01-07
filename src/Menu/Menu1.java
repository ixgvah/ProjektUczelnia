package Menu;

import DodawanieRoznychObiektow.*;
import projekt.*;
import usuwanieKursu.UsuwanieKursu;
import usuwanieKursu.UsuwanieKursuSposob1;
import usuwanieStudentow.UsunStudenta;
import usuwanieStudentow.UsuwanieSposob1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu1 implements Menu, DodawanieObiektow {
    public void wyswietlMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program mozna zakonczyc poprzez wpisanie STOP");
        while (true) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Utwórz studenta.");
            System.out.println("2. Utwórz pracownika badawczo dydaktycznego.");
            System.out.println("3. Utwórz pracownika administracyjnego.");
            System.out.println("4. Utwórz kursu.");
            System.out.println("5. Wypisz osoby z uczelni.");
            System.out.println("6. Wypisz kursy.");
            System.out.println("7. Wypisz studentow.");
            System.out.println("8. Wypisz pracownikow.");
            System.out.println("9. Wyszukaj studentow.");
            System.out.println("10. Wyszukaj pracownikow.");
            System.out.println("11. Serializuj osoby. ");
            System.out.println("12. Serializuj kursy. ");
            System.out.println("13. Derializuj osoby. ");
            System.out.println("14. Deserializuj kursy. ");
            System.out.println("15. Usun wykładowce. ");
            System.out.println("16. Usun studenta. ");
            System.out.println("17. Usun kurs. ");
            System.out.println("18. Wybierz kurs. ");
            System.out.println("19. Wyznacz date egzaminu. ");
            System.out.println("20. Sortuj osoby z uczelni. ");
            String znak = sc.nextLine();
            if(!znak.equalsIgnoreCase("STOP")){
                switch (znak) {
                    case "1":
                        DodanieStudenta s1 = new DodanieStudenta();
                        s1.dodajObiekt();
                        break;
                    case "2":
                        DodaniePracownikaBadawczoDydaktycznego p1 = new DodaniePracownikaBadawczoDydaktycznego();
                        p1.dodajObiekt();
                        break;
                    case "3":
                        DodaniePracownikaAdministracyjnego p2 = new DodaniePracownikaAdministracyjnego();
                        p2.dodajObiekt();
                        break;
                    case "4":
                        DodanieKursu p3 = new DodanieKursu();
                        p3.dodajObiekt();
                        break;
                    case "5":
                        System.out.println(Uczelnia.getInstance());
                        break;
                    case "6":
                        System.out.println(Kursy.getInstance());
                        break;
                    case "7":
                        Uczelnia.getInstance().wypiszStudentow();
                        break;
                    case "8":
                        Uczelnia.getInstance().wypiszPracownikow();
                        break;
                    case "9":
                        System.out.println("Podaj pole, po ktorym chcesz wyszukac (imie, nazwisko, pesel, indeks, rok, nazwa kursu. ");
                        String pole1 = sc.nextLine();
                        System.out.println("Podaj wartosc wybranego pola. ");
                        String wartosc1 = sc.nextLine();
                        System.out.println(Uczelnia.getInstance().wyszukajStudenta(pole1, wartosc1));
                        break;
                    case "10":
                        System.out.println("Podaj pole, po ktorym chcesz wyszukac (imie, nazwisko, pesel, staz, stanowisko, liczba nadgodzin, pensja. ");
                        String pole2 = sc.nextLine();
                        System.out.println("Podaj wartosc wybranego pola. ");
                        String wartosc2 = sc.nextLine();
                        System.out.println(Uczelnia.getInstance().wyszukajPracownika(pole2, wartosc2));
                        break;
                    case "11":
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Osoby.txt"))) {
                            Uczelnia uczelnia = Uczelnia.getInstance();
                            for(int i=0; i<uczelnia.getUczelnia().size(); i++){
                                oos.writeObject(uczelnia.getUczelnia().get(i));
                            }
                            System.out.println("Serializacja zakończona sukcesem. ");
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.out.println("Serializacja nie powiodła się. ");
                        }
                        break;
                    case "12":
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Kursy.txt"))) {
                            Kursy kursy = Kursy.getInstance();
                            for(int i=0; i<kursy.getKursy().size(); i++){
                                oos.writeObject(kursy.getKursy().get(i));
                            }
                            System.out.println("Serializacja zakończona sukcesem. ");
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.out.println("Serializacja nie powiodła się. ");
                        }
                        break;
                    case "13":
                        ArrayList<Osoba> osoby = new ArrayList<>();
                        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("osoby.txt"))){
                            while (true) {
                                try {
                                    Osoba osoba = (Osoba) in.readObject();
                                    osoby.add(osoba);
                                } catch (EOFException e) {
                                    // Koniec pliku - zakończ pętlę
                                    break;
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                } catch (ClassNotFoundException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        for(Osoba o: osoby){
                            System.out.println(o);
                        }
                    case "14":
                        ArrayList<Kurs> kursy = new ArrayList<>();
                        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Kursy.txt"))){
                            while (true) {
                                try {
                                    Kurs kurs = (Kurs) in.readObject();
                                    kursy.add(kurs);
                                } catch (EOFException e) {
                                    break;
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                } catch (ClassNotFoundException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        for(Kurs kurs: kursy){
                            System.out.println(kurs);
                        }
                        break;
                    case "15":
                        Menu m = new MenuUsuwaniaPracownika(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        m.wyswietlMenu();
                        break;
                    case "16":
                        UsunStudenta u = new UsuwanieSposob1(){
                            @Override
                            public void usunStudenta() {
                                super.usunStudenta();
                            }
                        };
                        u.usunStudenta();
                        break;
                    case "17":
                        UsuwanieKursu uK = new UsuwanieKursuSposob1(){
                            public void UsunKurs(){
                                super.UsunKurs();
                            }
                        };
                        uK.UsunKurs();
                        break;
                    case "18":
                        System.out.println("Podaj pesel studenta, dla ktorego wybierasz kurs. ");
                        String pesel = sc.nextLine();
                        System.out.println("Podaj pełną nazwe wybranego kursu");
                        String kurs = sc.nextLine();
                        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
                            if(o.getPesel().equals(pesel)){
                                if(o instanceof Student) {
                                    for (Kurs k : Kursy.getInstance().getKursy()) {
                                        if (k.getNazwa().equalsIgnoreCase(kurs)) {
                                            ((Student) o).getWybraneKursy().add(k);
                                            System.out.println("Wybrano kurs. ");
                                        }
                                        }
                                    }
                                }
                            }
                        break;
                    case "19":
                        DodanieDaty d = new DodanieDaty();
                        d.dodajObiekt();
                        break;
                    case "20":
                        MenuSortowania menuSortowania = new MenuSortowania(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        menuSortowania.wyswietlMenu();
                        break;
                    default:
                        System.out.println("Nie wybrano zadnej z opcji. ");
                        break;
                }

            }
            else{
                break;
            }
        }

    }
}