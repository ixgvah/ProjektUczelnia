package Komparatory.SortowanieOsob;
import projekt.Osoba;

import java.util.Comparator;

public class PorownanieNazwisko implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}
