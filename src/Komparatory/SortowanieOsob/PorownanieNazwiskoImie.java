package Komparatory.SortowanieOsob;

import projekt.Osoba;

import java.util.Comparator;

public class PorownanieNazwiskoImie implements Comparator<Osoba> {
    public int compare(Osoba o1, Osoba o2) {
        int wynik = o1.getNazwisko().compareTo(o2.getNazwisko());
        if(wynik == 0){
            return o1.getImie().compareTo(o2.getImie());
        }
        return wynik;
    }
}
