package usuwaniePracownikow;

import projekt.*;

import java.util.ArrayList;
import java.util.Scanner;

public class usunProwadzacegoSkutekPrzypisanieNowegoZListy implements usunPracownika {
    public void usunPracownika(){
        System.out.println("Podaj pole, po którym chcesz wyszukać pracownika: (nazwisko, imie, staż pracy, stanowisko");
        Scanner sc = new Scanner(System.in);
        String pole = sc.nextLine();
        while(!(pole.equalsIgnoreCase("nazwisko") || pole.equalsIgnoreCase("imie")|| pole.equalsIgnoreCase("staz pracy") || pole.equalsIgnoreCase("stanowisko"))){
            System.out.println("Niepoprawna nazwa pola, sprobuj ponownie. ");
            pole = sc.nextLine();
        }
        System.out.println("Podaj wartość wybranego pola:");
        String wartosc = sc.nextLine();
        ArrayList<PracownikUczelni> usuwani = Uczelnia.getInstance().wyszukajPracownika(pole, wartosc);
        PracownikBadawczoDydaktyczny p1 = new PracownikBadawczoDydaktyczny("Marcin", "Tasak", "7510021003171", "kierownik katedry", 20, 15000, 100);
        for(PracownikUczelni p : usuwani){
            for(Kurs k: Kursy.getInstance().getKursy()){
                if(k.getWykladowca().equals(p)){
                    k.setWykladowca(p1);
                }
            }
            Uczelnia.getInstance().usunOsobe(p);
        }
    }
}
