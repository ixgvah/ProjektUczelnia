package Menu;

import projekt.Kursy;
import projekt.Uczelnia;

import java.util.Scanner;

public class MenuWyszukiwania implements Menu {
    @Override
    public void wyswietlMenu() {
        System.out.println("1. Wyszukaj studentow.");
        System.out.println("2. Wyszukaj pracownikow.");
        System.out.println("3. Wyszukaj kursy.");
        Scanner sc = new Scanner(System.in);

        switch (sc.nextLine()) {
            case "1":
                System.out.println("Podaj pole, po ktorym chcesz wyszukac (imie, nazwisko, pesel, indeks, rok, nazwa kursu). ");
                String pole1 = sc.nextLine();
                System.out.println("Podaj wartosc wybranego pola. ");
                String wartosc1 = sc.nextLine();
                System.out.println("Studenci spełniający podane kryteria to: ");
                System.out.println(Uczelnia.getInstance().wyszukajStudenta(pole1, wartosc1));
                break;
            case "2":
                System.out.println("Podaj pole, po ktorym chcesz wyszukac (imie, nazwisko, pesel, staz, stanowisko, liczba nadgodzin, pensja). ");
                String pole2 = sc.nextLine();
                System.out.println("Podaj wartosc wybranego pola. ");
                String wartosc2 = sc.nextLine();
                System.out.println("Pracownicy spełniający podane kryteria to: ");
                System.out.println(Uczelnia.getInstance().wyszukajPracownika(pole2, wartosc2));
                break;
            case "3":
                System.out.println("Podaj pole, po którym chcesz wyszukac (nazwa, ECTS, nazwisko prowadzacego)");
                String pole3 = sc.nextLine();
                System.out.println("Podaj wartosc wybranego pola. ");
                String wartosc3 = sc.nextLine();
                System.out.println("Kursy spełniające podane kryteria to:");
                System.out.println(Kursy.getInstance().wyszukajKursy(pole3, wartosc3));
                break;
            default:
                System.out.println("Niepoprawne pole. ");
                break;
        }
    }
}
