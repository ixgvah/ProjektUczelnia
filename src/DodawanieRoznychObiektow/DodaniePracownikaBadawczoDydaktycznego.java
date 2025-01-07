package DodawanieRoznychObiektow;

import projekt.PracownikBadawczoDydaktyczny;
import projekt.Uczelnia;

import java.util.Scanner;

public class DodaniePracownikaBadawczoDydaktycznego implements DodawanieObiektow {
    public void dodajObiekt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = sc.nextLine();
        System.out.println("Podaj pesel");
        String pesel = sc.nextLine();
        System.out.println("Podaj stanowisko");
        String stanowisko = sc.nextLine();
        System.out.println("Podaj staz");
        int staz = sc.nextInt();
        System.out.println("Podaj pensje");
        int pensja = sc.nextInt();
        System.out.println("Podaj liczbe publikacji");
        int liczbaPublikacji = sc.nextInt();
        PracownikBadawczoDydaktyczny pracownik = new PracownikBadawczoDydaktyczny(imie, nazwisko, pesel, stanowisko, staz, pensja, liczbaPublikacji);
        Uczelnia.getInstance().add(pracownik);
        System.out.println("Dodano nowego pracownika");

    }
}
