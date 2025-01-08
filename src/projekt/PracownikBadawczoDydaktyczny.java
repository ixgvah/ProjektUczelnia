package projekt;

import java.util.Objects;

public class PracownikBadawczoDydaktyczny extends PracownikUczelni {
    private int liczbaPublikacji;

    public PracownikBadawczoDydaktyczny(String imie, String nazwisko, String pesel, String stanowisko, int staz, double pensja, int liczbaPublikacji) {
        super(imie, nazwisko, pesel, stanowisko, staz, pensja);
        if(stanowisko.equals("Asystent") || stanowisko.equals("Adiunkt") || stanowisko.equals("Profesor Nadzwyczajny") || stanowisko.equals("Profesor Zwyczajny") || stanowisko.equals("Wykladowca")){
            this.stanowisko = stanowisko;
        }
        this.liczbaPublikacji = liczbaPublikacji;
    }


    public int getLiczbaPublikacji() {
        return liczbaPublikacji;
    }
    public void setLiczbaPublikacji(int liczbaPublikacji) {
        this.liczbaPublikacji = liczbaPublikacji;
    }

    @Override
    public String toString() {
        return super.toString() + ", liczba publikacji: " + liczbaPublikacji;
    }

}
