package projekt;

import java.util.Objects;

public abstract class PracownikUczelni extends Osoba {
    protected String stanowisko;
    protected int staz; //staz pracy w latach
    protected double pensja;

    public PracownikUczelni(String imie, String nazwisko, String pesel, String stanowisko, int staz, double pensja) {
        super(imie, nazwisko, pesel);
        this.stanowisko = stanowisko;
        this.staz = staz;
        this.pensja = pensja;
    }



    public String getStanowisko() {
        return stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public int getStaz() {
        return staz;
    }
    public void setStaz(int staz) {
        this.staz = staz;
    }
    public double getPensja() {
        return pensja;
    }
    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() + ", stanowisko: " + stanowisko + ", staz: " + staz + ", pensja: " + pensja;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Jeśli to ten sam obiekt
        if (obj == null || getClass() != obj.getClass()) return false; // Null lub różna klasa
        PracownikUczelni pracownik = (PracownikUczelni) obj;
        return pesel.equals(pracownik.pesel); // Porównanie wyłącznie na podstawie PESEL
    }
    public int hashCode() {
        return pesel.hashCode();
    }
}
