package Menu;

import DodawanieRoznychObiektow.DodanieKursu;
import DodawanieRoznychObiektow.DodaniePracownikaAdministracyjnego;
import DodawanieRoznychObiektow.DodaniePracownikaBadawczoDydaktycznego;
import DodawanieRoznychObiektow.DodanieStudenta;

import java.util.Scanner;

public class MenuTworzeniaObiektu implements Menu {
    public void wyswietlMenu() {
        System.out.println("1. Utwórz studenta.");
        System.out.println("2. Utwórz pracownika badawczo dydaktycznego.");
        System.out.println("3. Utwórz pracownika administracyjnego.");
        System.out.println("4. Utwórz kursu.");
        Scanner sc = new Scanner(System.in);
        String wynik = sc.nextLine();
        switch (wynik) {
            case "1":
                DodanieStudenta s1 = new DodanieStudenta();
                s1.dodajObiekt();
                System.out.println("Utworzono nowego studenta. ");
                break;
            case "2":
                DodaniePracownikaBadawczoDydaktycznego p1 = new DodaniePracownikaBadawczoDydaktycznego();
                p1.dodajObiekt();
                System.out.println("Utworzono nowego pracownika badawczo dydaktycznego. ");
                break;
            case "3":
                DodaniePracownikaAdministracyjnego p2 = new DodaniePracownikaAdministracyjnego();
                p2.dodajObiekt();
                System.out.println("Utworzono nowego pracownika administracyjnego. ");
                break;
            case "4":
                DodanieKursu p3 = new DodanieKursu();
                p3.dodajObiekt();
                System.out.println("Utworzono nowy kurs. ");
                break;
            default:
                System.out.println("Niepoprawne pole");
        }
    }
}
