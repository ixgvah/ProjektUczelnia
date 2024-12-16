package projekt;

import menu.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Uczelnia uczelnia = Uczelnia.getInstance();
        Student s1 = new Student("Iga", "Posturzynska", "05262006124", "123281", 3, true, 1, true);
        Student s2 = new Student("Iga", "Kot", "05262006124", "123281", 3, true, 1, true);
        Student s3 = new Student("Bartłomiej", "Wierzbicki", "80111069309", "324234", 4, true, 2, false);
        Student s4 = new Student("Roman", "Marciniak", "30061198387", "123343", 2, false, 1, true);
        uczelnia.add(s1);
        uczelnia.add(s2);
        uczelnia.add(s3);
        uczelnia.add(s4);

        PracownikBadawczoDydaktyczny p1 = new PracownikBadawczoDydaktyczny("Barbara", "Borkowska", "40112760227", "wykladowca", 20, 7000, 2);
        PracownikBadawczoDydaktyczny p2 = new PracownikBadawczoDydaktyczny("Teresa", "Polak", "81021304944", "wykladowca", 25, 7400, 20);
        PracownikBadawczoDydaktyczny p3 = new PracownikBadawczoDydaktyczny("Olga", "Krupa", "96102217527", "wykladowca", 10, 5500, 1);
        uczelnia.add(p1);
        uczelnia.add(p2);
        uczelnia.add(p3);
        Kurs k1 = new Kurs("Analiza matematyczna", p1, 10);
        Kursy kursy = Kursy.getInstance();
        Kurs k3 = new Kurs("Algebra liniowa z geometria analityczna", p1, 2);
        Kurs k4 = new Kurs("Fizyka", p2, 5);
        Kurs k5 = new Kurs("Programowanie strukturalne i obiektowe", p3, 8);
        System.out.println("Wykonywanie programu możesz przerwac w każdej chwili wisująć STOP");
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu1() {
            public void dodajObiekt() {}

            public void wyswietlMenu() {
                super.wyswietlMenu();
            }
        };

        menu.wyswietlMenu();
        System.out.println("Program zakończony. ");
    }

}
