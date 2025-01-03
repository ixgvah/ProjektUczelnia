package Komparatory.SortowanieKursow;

import projekt.Kurs;

import java.util.Comparator;

public class PorownanieECTS implements Comparator<Kurs> {
    public int compare(Kurs k1, Kurs k2) {
        String ects1 = String.valueOf(k1.getECTS());
        String ects2 = String.valueOf(k2.getECTS());
        return ects1.compareTo(ects2);
    }
}
