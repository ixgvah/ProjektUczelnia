package Menu;

import projekt.Kursy;
import projekt.Uczelnia;

import java.util.Scanner;

public class MenuWypisywania implements Menu {
    @Override
    public void wyswietlMenu() {
        System.out.println("1. Wypisz osoby z uczelni.");
        System.out.println("2. Wypisz kursy.");
        System.out.println("3. Wypisz studentow.");
        System.out.println("4. Wypisz pracownikow.");
        Scanner sc = new Scanner(System.in);
        String wynik = sc.nextLine();
        switch (wynik) {
            case "1":
                System.out.println("Osoby znajdujace sie w bazie uczelni: ");
                System.out.println(Uczelnia.getInstance());
                break;
            case "2":
                System.out.println("Kursy znajdujące się w bazie kursów: ");
                System.out.println(Kursy.getInstance());
                break;
            case "3":
                System.out.println("Studenci znajdujący się w bazie uczelni: ");
                Uczelnia.getInstance().wypiszStudentow();
                break;
            case "4":
                System.out.println("Pracownicy znajdujący się w bazie uczelni: ");
                Uczelnia.getInstance().wypiszPracownikow();
                break;
            default:
                System.out.println("Niepoprawne pole");
                break;
        }
    }
}
