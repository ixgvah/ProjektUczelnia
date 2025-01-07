package Komparatory.SortowanieOsob;

import projekt.Osoba;

import java.util.Comparator;

public class PorownanieNazwiskoWiek implements Comparator<Osoba> {
    public int compare(Osoba o1, Osoba o2) {
        int wynik = o1.getNazwisko().compareTo(o2.getNazwisko());
        if(wynik == 0){
            String wiek1=String.valueOf(o1.getWiek());
            String wiek2= String.valueOf(o2.getWiek());
            return -1*wiek1.compareTo(wiek2);
        }
        return wynik;
    }
}
