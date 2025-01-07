package usuwanieKursu;

import projekt.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static projekt.Uczelnia.getInstance;

public class UsuwanieKursuSposob1 implements UsuwanieKursu {
    public void UsunKurs() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Podaj pole, które mają mieć kursy, które chcesz usunąć. (nazwa, ECTS, nazwisko prowadzacego)");
            String pole = sc.nextLine();
            while (!(pole.equalsIgnoreCase("nazwa") || pole.equalsIgnoreCase("ECTS") || pole.equalsIgnoreCase("nazwisko") || pole.equalsIgnoreCase("nazwisko prowadzacego"))) {
                System.out.println("Niepoprawne pole. Spróbuj jeszcze raz. ");
                pole = sc.nextLine();
            }
            System.out.println("Podaj wartosc wybranego pola. ");
            String wartosc = sc.nextLine();
            ArrayList<Kurs> usuniete = Kursy.getInstance().wyszukajKursy(pole, wartosc);
            for(Kurs k: usuniete){
                Kursy.getInstance().usunKurs(k);
            }
        }
}