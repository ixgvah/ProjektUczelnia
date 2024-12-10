package projekt;

import java.util.*;
public class Student extends Osoba {
    private String indeks;
    private int rok;
    private boolean erasmus;
    private int stopien; //0 - I stopnia, 1 - II stopnia
    private boolean stacjonarnie; // 1 - stacjonarnie, 0 - niestacjonarnie
    private ArrayList<Kurs> wybraneKursy = new ArrayList<>();
    public Student(String imie, String nazwisko, String pesel, String indeks, int rok, boolean erasmus, int stopien, boolean stacjonarnie) {
        super(imie, nazwisko, pesel);
        this.indeks = indeks;
        this.rok = rok;
        this.erasmus = erasmus;
        this.stopien = stopien;
        this.stacjonarnie = stacjonarnie;
    }
    public String getIndeks() {
        return indeks;
    }
    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }
    public int getRok() {
        return rok;
    }
    public void setRok(int rok) {
        this.rok = rok;
    }
    public boolean isErasmus() {
        return erasmus;
    }
    public void setErasmus(boolean erasmus) {
        this.erasmus = erasmus;
    }
    public int isStopien() {
        return stopien;
    }
    public void setStopien(int stopien) {
        this.stopien = stopien;
    }
    public boolean isStacjonarnie() {
        return stacjonarnie;
    }
    public void setStacjonarnie(boolean stacjonarnie) {
        this.stacjonarnie = stacjonarnie;
    }
    public String getIndeks(String indeks){
        return indeks;
    }
    public void setIndeks(){
        this.indeks = indeks;
    }
    public ArrayList<Kurs> getWybraneKursy() {
        return wybraneKursy;
    }
    public void setWybraneKursy(ArrayList<Kurs> wybraneKursy) {
        this.wybraneKursy = wybraneKursy;
    }
    public String toString() {
        String kursyStudenta="";
        for(Kurs kurs: wybraneKursy){
            kursyStudenta+=kurs.getNazwa()+"; ";
        }
        return super.toString() + ", indeks: " + indeks + ", rok: " + rok + ", czy student z erasmusa: " + erasmus + ", stopien: " + stopien + ", stacjonarnie: " + stacjonarnie + ", kursy: " + kursyStudenta;
    }

    public void dodanieKursu(Kurs k){
        Kursy kursy = Kursy.getInstance();
        if(kursy.czyNalezy(k)){
            wybraneKursy.add(k);
        }
    }
    public void usunKursZWybranych(Kurs k){
        if(wybraneKursy.contains(k)){
            wybraneKursy.remove(k);
        }
    }

}
