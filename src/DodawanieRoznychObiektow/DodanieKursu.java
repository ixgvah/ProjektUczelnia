package DodawanieRoznychObiektow;

import projekt.Kurs;
import projekt.PracownikBadawczoDydaktyczny;
import projekt.PracownikUczelni;
import projekt.Uczelnia;

import java.util.ArrayList;
import java.util.Scanner;

public class DodanieKursu implements DodawanieObiektow {
    public void dodajObiekt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe kursu. ");
        String nazwa = sc.nextLine();
        System.out.println("Wybierz prowadzacego - podaj numer PESEL wybranego. ");
        Uczelnia.getInstance().wypiszWykladowcow();
        String numer = sc.nextLine();
        ArrayList<PracownikUczelni> wykladowca;
        wykladowca = Uczelnia.getInstance().wyszukajPracownika("pesel", numer);
        PracownikBadawczoDydaktyczny p;
        if (wykladowca.isEmpty()) {
            throw new IllegalArgumentException("Wykladowca o podanym peselu nie istnieje");
        }
        else{
                p = (PracownikBadawczoDydaktyczny) wykladowca.get(0);
            }
        System.out.println("Podaj ilosc puntkow ECTS. ");
        int ECTS = sc.nextInt();
        Kurs k = new Kurs(nazwa, p, ECTS);
    }
}
