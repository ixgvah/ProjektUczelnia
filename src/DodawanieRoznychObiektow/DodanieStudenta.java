package DodawanieRoznychObiektow;

import projekt.Student;
import projekt.Uczelnia;

import java.util.Scanner;

public class DodanieStudenta implements DodawanieObiektow {
    public void dodajObiekt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = sc.nextLine();
        System.out.println("Podaj pesel");
        String pesel = sc.nextLine();
        System.out.println("Podaj indeks");
        String indeks = sc.nextLine();
        System.out.println("Podaj rok");
        int rok = sc.nextInt();
        System.out.println("Podaj czy student jest z ERASMUSa (true/false)");
        boolean erasmus = sc.nextBoolean();
        System.out.println("Podaj stopien studiow");
        int stopien = sc.nextInt();
        System.out.println("Podaj czy student studiuje stacjonarnie (true/false)");
        boolean stacjonarnie = sc.nextBoolean();
        Student student1 =  new Student(imie, nazwisko, pesel, indeks, rok, erasmus, stopien, stacjonarnie);
        Uczelnia.getInstance().add(student1);

    }
}
