package usuwaniePracownikow;

import projekt.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class usunProacownikow implements usunPracownika {
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
            if (o instanceof PracownikBadawczoDydaktyczny) {
                for (Osoba s : Uczelnia.getInstance().getUczelnia()) {
                    if (s instanceof Student) {
                        Student student = (Student) s;

                        Iterator<Kurs> iterator = student.getWybraneKursy().iterator();
                        while (iterator.hasNext()) {
                            Kurs k = iterator.next();
                            if (k.getWykladowca().equals(o)) {
                                iterator.remove();
                            }

                        }
                    }
                }

                Uczelnia.getInstance().getUczelnia().remove(o);
            }
        }
        for (PracownikUczelni o : usuwani) {
            if (o instanceof PracownikBadawczoDydaktyczny) {
                Iterator<Kurs> iterator = Kursy.getInstance().getKursy().iterator();
                while (iterator.hasNext()) {
                    Kurs x = iterator.next();
                    if (x.getWykladowca().getNazwisko().equals(o.getNazwisko())) {
                        iterator.remove();
                    }
                }
            }
        }
    }
}
