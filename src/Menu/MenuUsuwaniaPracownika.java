package Menu;
import usuwaniePracownikow.*;
import java.util.Scanner;

public class MenuUsuwaniaPracownika implements Menu{
    public void wyswietlMenu(){
        System.out.println("1. Usunięcie pracownika");
        Scanner sc = new Scanner(System.in);
        String wynik;
        wynik = sc.nextLine();
        switch(wynik){
            case "1":
                usunProacownikow o = new usunProacownikow();
                o.usunPracownika();
                System.out.println("Pomyślnie usunięto osobę/osoby. ");
                break;
            default:
                System.out.println("Usuwanie zakończone niepowodzeniem");
        }

    }
}
