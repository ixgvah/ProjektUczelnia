package Menu;

import Komparatory.SortowanieKursow.PorownanieECTS;
import Komparatory.SortowanieOsob.PorownanieNazwisko;
import Komparatory.SortowanieOsob.PorownanieNazwiskoImie;
import Komparatory.SortowanieOsob.PorownanieNazwiskoWiek;
import projekt.Kurs;
import projekt.Kursy;
import projekt.Osoba;
import projekt.Uczelnia;

import java.util.Collections;
import java.util.Scanner;

public class MenuSortowania implements Menu{
    @Override
    public void wyswietlMenu() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Wybierz jedną z następujących opcji: ");
        System.out.println("1. Sortowanie osób z uczelni po nazwisku. ");
        System.out.println("2. Sortowanie osób z uczelni po nazwisku i imieniu. ");
        System.out.println("3. Sortowanie osób z uczelni po nazwisku i wieku. ");
        System.out.println("4. Sortowanie listy kursów po liczbie punktów ECTS. ");
        System.out.println("5. Sortowanie listy kursów po nazwisku prowadzącego. ");
        String wynik = sc.nextLine();
        switch (wynik) {
            case "1":
                Collections.sort(Uczelnia.getInstance().getUczelnia(), new PorownanieNazwisko());
                break;
            case "2":
                Collections.sort(Uczelnia.getInstance().getUczelnia(), new PorownanieNazwiskoImie());
                break;
            case "3":
                Collections.sort(Uczelnia.getInstance().getUczelnia(), new PorownanieNazwiskoWiek());
                break;
            case "4":
                Collections.sort(Kursy.getInstance().getKursy(), new PorownanieECTS());
                break;
            case "5":
                Collections.sort(Kursy.getInstance().getKursy(), new PorownanieECTS());
                break;
            default:
                System.out.println("Problem");
                break;
        }
        System.out.println("Posortowana lista: ");
        if(wynik!="4" && wynik !="5"){
            for(Osoba o: Uczelnia.getInstance().getUczelnia()){
                System.out.println(o);
            }
        }
        else{
            for(Kurs k: Kursy.getInstance().getKursy()){
                System.out.println(k);
            }
        }
    }
}
