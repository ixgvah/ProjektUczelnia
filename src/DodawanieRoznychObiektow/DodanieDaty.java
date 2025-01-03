package DodawanieRoznychObiektow;

import projekt.Kurs;
import projekt.Kursy;

import java.time.LocalDate;
import java.util.Scanner;

public class DodanieDaty implements DodawanieObiektow {
    public boolean czyPoprawna(int dzien, int miesiac, int rok){
        LocalDate data = LocalDate.now();
        if((rok<data.getYear()) || (dzien<1 || dzien>31) || (miesiac<1 || miesiac>12) || (rok==data.getYear() && (miesiac<data.getMonthValue() || (miesiac==data.getMonthValue() && dzien<=data.getDayOfMonth())))){
            return false;
        }

        if((rok%4==0 && rok%100!=0) || rok%400==0){
            if(miesiac==2 && dzien<29){
                return true;
            }
        }
        else {
            if (miesiac == 1 || miesiac == 3 || miesiac == 5 || miesiac == 7 || miesiac == 8 || miesiac == 10 || miesiac == 12) {
                if (dzien <= 31) {
                    return true;
                }
            } else if (miesiac == 2) {
                if (dzien <= 28) {
                    return true;
                }
            } else {
                if (dzien <= 30) {
                    return true;
                }
            }
        }
        return false;
    }

    public void dodajObiekt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pełną nazwę kursu, dla którego chcesz wyznaczyć datę egzaminu: ");
        String nazwa = sc.nextLine();
        System.out.println("Podaj dzień egzaminu: ");
        int dzien = sc.nextInt();
        System.out.println("Podaj miesiąc egzaminu: ");
        int miesiac = sc.nextInt();
        System.out.println("Podaj rok egzaminu: ");
        int rok = sc.nextInt();
        while(!czyPoprawna(dzien,miesiac,rok)){
            System.out.println("Niepoprawna data. Spróbuj ponownie. ");
            System.out.println("Podaj dzień egzaminu: ");
            dzien = sc.nextInt();
            System.out.println("Podaj miesiąc egzaminu: ");
            miesiac = sc.nextInt();
            System.out.println("Podaj rok egzaminu: ");
            rok = sc.nextInt();
        }
        LocalDate data = LocalDate.of(rok, miesiac, dzien);
        for(Kurs k: Kursy.getInstance().getKursy()){
            if(k.getNazwa().equalsIgnoreCase(nazwa)){
                k.setData(data);
            }
        }
        System.out.println("Data egzaminu to: "+ data);
    }
}
