package usuwanieKursu;

import projekt.*;

import java.util.ArrayList;
import java.util.Scanner;

import static projekt.Uczelnia.getInstance;

public class UsuwanieKursuSposob1 implements UsuwanieKursu {
    public void UsunKurs(){
        System.out.println("Uwaga. Usuwanie kursu spowoduje usuniecie go także spośród kursów wybranych przez studentów. Czy chcesz kontynuować? ");
        Scanner sc = new Scanner(System.in);
        String odpowiedz = sc.nextLine();
        if(odpowiedz.equals("tak")|| odpowiedz.equals("kontynuuj")){
            System.out.println("Podaj pole, które mają mieć kursy, które chcesz usunąć. (nazwa, ECTS, nazwisko prowadzacego)");
            String pole = sc.nextLine();
            while(!(pole.equalsIgnoreCase("nazwa") || pole.equalsIgnoreCase("ECTS") || pole.equalsIgnoreCase("nazwisko"))){
                System.out.println("Niepoprawne pole. Spróbuj jeszcze raz. ");
                pole = sc.nextLine();
            }
            System.out.println("Podaj wartosc wybrnego pola. ");
            String wartosc = sc.nextLine();
            ArrayList<Kurs> usuniete = Kursy.getInstance().wyszukajKursy(pole, wartosc);
            for(Kurs k: usuniete){
                for(Osoba o: Uczelnia.getInstance().getUczelnia()){
                    if(o instanceof Student){
                        if(((Student) o).getWybraneKursy().equals(k)){
                            ((Student) o).usunKursZWybranych(k);
                        }
                    }
                }
                Kursy.getInstance().usunKurs(k);
            }
        }
    }
}
