package Menu;
import usuwaniePracownikow.*;
import java.util.Scanner;

public class MenuUsuwaniaPracownika implements Menu{
    public void wyswietlMenu(){
        System.out.println("Usuwanie pracownika może wiązać się z konsekwencjami, jeśli prowadzi on na uczelni kursy. Wybierz możliwe konsekwencje: ");
        System.out.println("1. Usunięcie wszystkich kursów prowadzonych przez wykładowcę, spowoduje to usujnięcie danego kursu wśród listy kursów wybranych przez studentów. ");
        System.out.println("2. Przypisanie innego wykładowcy. ");
        Scanner sc = new Scanner(System.in);
        String wynik;
        wynik = sc.nextLine();
        switch(wynik){
            case "1":
                usunProwadzacegoSkutekUsuwanieKursu o = new usunProwadzacegoSkutekUsuwanieKursu();
                o.usunPracownika();
                System.out.println("Pomyślnie usunięto osobę/osoby. ");
                break;
            case "2":
                usunProwadzacegoSkutekPrzypisanieNowegoZListy k= new usunProwadzacegoSkutekPrzypisanieNowegoZListy();
                k.usunPracownika();
                System.out.println("Pomyślnie usunięto osobę/osoby. ");
                break;
            default:
                System.out.println("Usuwanie zakończone niepowodzeniem");
        }

    }
}
