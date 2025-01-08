package projekt;

import java.util.Objects;

public class PracownikAdministracyjny extends PracownikUczelni {
    private int liczbaNadgodzin;

    public PracownikAdministracyjny(String imie, String nazwisko, String pesel, String stanowisko, int staz, double pensja, int liczbaNadgodzin) {
        super(imie, nazwisko, pesel, stanowisko, staz, pensja);
        this.liczbaNadgodzin=liczbaNadgodzin;
    }
    public int getLiczbaNadgodzin() {
        return liczbaNadgodzin;
    }
    public void setLiczbaNadgodzin(int liczba) {
        liczbaNadgodzin=liczba;
    }
    public String toString() {
        return super.toString() + ", liczba nadgodzin: " + liczbaNadgodzin;
    }

}
