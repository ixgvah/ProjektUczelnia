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

public abstract class MenuGlowne implements Menu, DodawanieObiektow {
    public void wyswietlMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program mozna zakonczyc poprzez wpisanie STOP");
        while (true) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Utwórz obiekt.");
            System.out.println("2. Wypisz obiekt.");
            System.out.println("3. Wyszukaj obiekt");
            System.out.println("4. Serializuj/deserializuj obiekty. ");
            System.out.println("5. Usun obiekt. ");
            System.out.println("6. Wybierz kurs. ");
            System.out.println("7. Wyznacz date egzaminu. ");
            System.out.println("8. Sortuj osoby z uczelni. ");
            System.out.println("9. Usun duplikaty. ");
            String znak = sc.nextLine();
            if(!znak.equalsIgnoreCase("STOP")){
                switch (znak) {
                    case "1":
                        MenuTworzeniaObiektu mt = new MenuTworzeniaObiektu(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        mt.wyswietlMenu();
                        break;
                    case "2":
                        MenuWypisywania mw = new MenuWypisywania(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        mw.wyswietlMenu();
                        break;
                    case "3":
                        MenuWyszukiwania mws = new MenuWyszukiwania(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        mws.wyswietlMenu();
                        break;
                    case "4":
                        MenuSerializacjiDeserializacji msd = new MenuSerializacjiDeserializacji(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        msd.wyswietlMenu();
                        break;
                    case "5":
                        MenuUsuwania mu = new MenuUsuwania(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        mu.wyswietlMenu();
                        break;
                    case "6":
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
                    case "7":
                        DodanieDaty d = new DodanieDaty();
                        d.dodajObiekt();
                        break;
                    case "8":
                        MenuSortowania menuSortowania = new MenuSortowania(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        menuSortowania.wyswietlMenu();
                        break;
                    case "9":
                        MenuUsuwaniaDuplikatow mud = new MenuUsuwaniaDuplikatow(){
                            @Override
                            public void wyswietlMenu() {
                                super.wyswietlMenu();
                            }
                        };
                        mud.wyswietlMenu();
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