package projekt;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Objects;

public abstract class Osoba implements Serializable{
    protected String imie;
    protected String nazwisko;
    protected String pesel;
    protected int wiek;
    protected String plec;

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        if(poprawnyPesel(pesel)){
            this.pesel = pesel;
        }
        else{
            throw new IllegalArgumentException("Niepoprawny pesel");
        }

        this.wiek = podajwiek(this.pesel);
        if((int)this.pesel.charAt(9)%2==0){
            this.plec = "kobieta";
        }
        else{
            this.plec="mezczyzna";
        }
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public String getPlec() {
        return plec;
    }
    public void setPlec(String plec) {
        this.plec = plec;
    }
    public boolean poprawnyPesel(String pesel) {
        if(pesel.length()!=11){
            return false;
        }
        for(int i=0; i<pesel.length(); i++) {
            if(!(pesel.charAt(i)>=48 && pesel.charAt(i)<=57)) {
                return false;
            }
        }
;        return true;
    }
    public int podajwiek(String pesel) {
        int rok = Integer.parseInt(pesel.substring(0, 2)); // Pierwsze dwie cyfry PESEL - rok
        int miesiac = Integer.parseInt(pesel.substring(2, 4));
        int dzien;

        // Sprawdzanie, czy rok należy do XX czy XXI wieku na podstawie dwóch pierwszych cyfr
        if (miesiac <= 12) {
            rok += 1900; // projekt.Osoba urodzona w XX wieku
        } else {
            rok += 2000; // projekt.Osoba urodzona w XXI wieku
            miesiac -= 20; // Miesiąc w XXI wieku jest o 20 większy
        }

        dzien = Integer.parseInt(pesel.substring(4, 6)); // Dzień to cyfry na pozycjach 4-5

        LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);

        return Period.between(dataUrodzenia, LocalDate.now()).getYears();
    }

    public String toString() {
        return "imie: " + imie + ", nazwisko: " + nazwisko + ", pesel: " + pesel + ", wiek: " + wiek + ", plec: " + plec;
    }

    public int hashCode(){
        return 0;
    }


}
