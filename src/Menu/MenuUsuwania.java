package Menu;
import usuwanieKursu.UsuwanieKursu;
import usuwanieKursu.UsuwanieKursuSposob1;
import usuwaniePracownikow.*;
import usuwanieStudentow.UsunStudenta;
import usuwanieStudentow.UsuwanieSposob1;

import java.util.Scanner;

public class MenuUsuwania implements Menu{
    public void wyswietlMenu(){
        System.out.println("1. Usun wykładowce. ");
        System.out.println("2. Usun studenta. ");
//        System.out.println("3. Usun kurs. ");
        Scanner sc = new Scanner(System.in);
        String wynik;
        wynik = sc.nextLine();
        switch(wynik){
            case "1":
                usunProacownikow o = new usunProacownikow();
                o.usunPracownika();
                System.out.println("Pomyślnie usunięto studenta/studentów. ");
                break;
            case "2":
                UsunStudenta u = new UsuwanieSposob1(){
                    @Override
                    public void usunStudenta() {
                        super.usunStudenta();
                    }
                };
                System.out.println("Pomyślnie usunięto wykładowcę/wykładowców. ");
                u.usunStudenta();
                break;
//            case "3":
//                UsuwanieKursu uK = new UsuwanieKursuSposob1(){
//                    public void UsunKurs(){
//                        super.UsunKurs();
//                    }
//                };
//                uK.UsunKurs();
//                break;
            default:
                System.out.println("Niepoprawne pole. ");
        }

    }
}
