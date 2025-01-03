package usuwanieStudentow;

import projekt.Student;
import projekt.Uczelnia;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuwanieSposob1 implements UsunStudenta{
    public void usunStudenta(){
        System.out.println("Podaj pole, po którym chcesz wyszukać studenta/studentów: (imie, nazwisko, rok, indeks)");
        Scanner sc = new Scanner(System.in);
        String pole = sc.nextLine();
        while(!(pole.equalsIgnoreCase("nazwiski") || pole.equalsIgnoreCase("imie") || pole.equalsIgnoreCase("numer indeksu") || pole.equalsIgnoreCase("rok"))){
            System.out.println("Niepoprawne pole, sprobuj ponownie");
            pole = sc.nextLine();
        }
        System.out.println("Podaj wartosc wybranego pola");
        String wartosc = sc.nextLine();
        ArrayList<Student> usunieci = Uczelnia.getInstance().wyszukajStudenta(pole, wartosc);
        for(Student s : usunieci){
            Uczelnia.getInstance().usunOsobe(s);
        }
        System.out.println("Usuwanie studentów spełniających podane warunki zakończono.");
    }
}
