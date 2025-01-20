package Komparatory.SortowanieKursow;

import projekt.Kurs;

import java.util.Comparator;

public class PorownanieECTS implements Comparator<Kurs> {
    public int compare(Kurs k1, Kurs k2) {
        return -1 * Integer.valueOf(k1.getECTS()).compareTo(k2.getECTS());
    }
}
