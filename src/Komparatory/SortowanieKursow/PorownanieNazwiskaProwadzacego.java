package Komparatory.SortowanieKursow;

import projekt.Kurs;

import java.util.Comparator;

public class PorownanieNazwiskaProwadzacego implements Comparator<Kurs> {
    public int compare(Kurs k1, Kurs k2) {
        return k1.getWykladowca().getNazwisko().compareTo(k2.getWykladowca().getNazwisko());
    }

}
