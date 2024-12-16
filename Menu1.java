package menu;

import projekt.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu1 implements Menu, DodawanieObiektow {
    public void wyswietlMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program mozna zakonczyc poprzez wpisanie STOP");
        while (true) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Dodaj studenta.");
            System.out.println("2. Dodaj pracownika badawczo dydaktycznego.");
            System.out.println("3. Dodaj pracownika administracyjnego.");
            System.out.println("4. Dodanie kursu.");
            System.out.println("5. Wypisz osoby z uczelni.");
            System.out.println("6. Wypisz kursy.");
            System.out.println("7. Wypisz studentow.");
            System.out.println("8. Wypisz pracownikow.");
            System.out.println("9. Wyszukaj studentow.");
            System.out.println("10. Wyszukaj pracownikow.");
            System.out.println("11. Serializuj osoby");
            System.out.println("12. Serializuj kursy");
            System.out.println("13. Derializuj osoby");
            System.out.println("14. Deserializuj kursy");
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