package usuwaniePracownikow;

import projekt.*;

import java.util.ArrayList;
import java.util.Scanner;


public class usunProwadzacegoSkutekUsuwanieKursu implements usunPracownika {
    public void usunPracownika() {
        System.out.println("Podaj pole, po którym chcesz wyszukać pracownika: (nazwisko, imie, staż pracy, stanowisko");
        Scanner sc = new Scanner(System.in);
        String pole = sc.nextLine();
        while (!(pole.equalsIgnoreCase("nazwisko") || pole.equalsIgnoreCase("imie") || pole.equalsIgnoreCase("staz pracy") || pole.equalsIgnoreCase("stanowisko"))) {
            System.out.println("Niepoprawna nazwa pola, sprobuj ponownie. ");
            pole = sc.nextLine();
        }
        System.out.println("Podaj wartość wybranego pola:");
        String wartosc = sc.nextLine();
        ArrayList<PracownikUczelni> usuwani = Uczelnia.getInstance().wyszukajPracownika(pole, wartosc);
        for (PracownikUczelni o : usuwani) {
            for (Kurs kurs : Kursy.getInstance().getKursy()) {
                if (kurs.getWykladowca().equals(o)) {
                    for (Osoba osoba : Uczelnia.getInstance().getUczelnia()) {
                        if (osoba instanceof Student) {
                            if (((Student) osoba).getWybraneKursy() != null) {
                                for (Kurs k : ((Student) osoba).getWybraneKursy()) {
                                    if (k.equals(kurs)) {
                                        ((Student) osoba).usunKursZWybranych(kurs);
                                    }
                                }
                            }
                        }
                    }
                    Kursy.getInstance().usunKurs(kurs);
                }
                Uczelnia.getInstance().usunOsobe(o);
            }
        }
    }
}
