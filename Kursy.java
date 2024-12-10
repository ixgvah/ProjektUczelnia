package projekt;

import java.util.ArrayList;

public class Kursy {
    private ArrayList<Kurs> kursy;
    private static Kursy instance; //Singleton instance, wzorzec projektowy, ktory pozwala na wykorzystanie zmiennej globalnie


    public Kursy() {
        kursy = new ArrayList<>();
    }
    public ArrayList<Kurs> getKursy() {
        return kursy;
    }
    public void setKursy(ArrayList<Kurs> kursy) {
        this.kursy = kursy;
    }
    public boolean czyNalezy(Kurs k){
        for(Kurs kurs : kursy){
            if(kurs.getNazwa().equals(k.getNazwa()) && kurs.getWykladowca().equals(k.getWykladowca()) && kurs.getECTS()==(k.getECTS())){
                return true;
            }
        }
        return false;
    }
    public void dodajKurs(Kurs k){
        if(!czyNalezy(k)){
            kursy.add(k);
        }
        else{
            throw new IllegalArgumentException("Taki kurs jest juz zamieszczony w bazie");
        }

    }
    public static Kursy getInstance() {
        if (instance == null) {
            instance = new Kursy();
        }
        return instance;
    }
    public String toString() {
        String s="";
        for (Kurs kurs : kursy) {
            s+=kurs.toString()+"\n";
        }
        return s;
    }
    public void usunKurs(Kurs k){
        kursy.remove(k);
    }
    public ArrayList<Kurs> wyszukajKursy(String pole, String wartosc){
        ArrayList<Kurs> wyniki = new ArrayList<>();
        for(Kurs kurs : kursy){
            switch(pole.toUpperCase()){
                case "NAZWA":
                    if(kurs.getNazwa().equalsIgnoreCase(wartosc)){
                        wyniki.add(kurs);
                    }
                    break;
                case "WYKLADOWCA":
                    String w = kurs.getWykladowca().imie+ " " + kurs.getWykladowca().nazwisko;
                    if(w.equalsIgnoreCase(wartosc)){
                        wyniki.add(kurs);
                    }
                    break;
                case "ECTS":
                    int punkty = Integer.parseInt(wartosc);
                    if(punkty==kurs.getECTS()){
                        wyniki.add(kurs);
                    }
                    break;
            default:
                System.out.println("x");
                return wyniki;
            }
        }
        return wyniki;
    }
}
