package DodawanieRoznychObiektow;

import projekt.PracownikAdministracyjny;
import projekt.Uczelnia;

import java.util.Scanner;

public class DodaniePracownikaAdministracyjnego implements DodawanieObiektow {
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
        double pensja = sc.nextDouble();
        System.out.println("Podaj liczbe nadgodzin");
        int liczbeNadgodzin = sc.nextInt();
        PracownikAdministracyjny p1 = new PracownikAdministracyjny(imie, nazwisko, pesel, stanowisko, staz, pensja, liczbeNadgodzin);
        Uczelnia.getInstance().add(p1);
        System.out.println("Utworzono nowego pracownika. ");
    }
}
