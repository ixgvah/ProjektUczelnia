package projekt;

import projekt.wzorzecObserwator.Observer;
import projekt.wzorzecObserwator.Subject;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Kurs implements Serializable, Subject {
    private String nazwa;
    private PracownikBadawczoDydaktyczny wykladowca;
    private int ECTS;
    private LocalDate dataEgzaminu = null;
    private ArrayList<Student> studenci = new ArrayList<>();

    public Kurs(String nazwa, PracownikBadawczoDydaktyczny wykladowca, int ECTS) {
        if(!Uczelnia.getInstance().czyProwadzacyWLiscie(wykladowca)) {
            throw new IllegalArgumentException("Podany wykladowca nie istnieje");
        }
        this.nazwa = nazwa;
        this.ECTS = ECTS;
        this.wykladowca = wykladowca;
        Kursy.getInstance().dodajKurs(this);
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public int getECTS() {
        return ECTS;
    }
    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public PracownikBadawczoDydaktyczny getWykladowca() {
        return wykladowca;
    }

    public void setWykladowca(PracownikBadawczoDydaktyczny wykladowca) {
        this.wykladowca = wykladowca;
    }
    public void setData(LocalDate data){
        this.dataEgzaminu = data;
        notifyObservers();
    }
    public LocalDate getData() {
        return dataEgzaminu;
    }

    public ArrayList<Student> getStudenci() {
        return studenci;
    }
    public void setStudenci(ArrayList<Student> studenci) {
        this.studenci = studenci;
    }
    public String toString() {
        if(this.dataEgzaminu != null) {
            return "nazwa: "+ nazwa + " prowadzący: " + wykladowca.getImie() + " " + wykladowca.getNazwisko() + " punkty ECTS: " + ECTS + " data Egzaminu: " + dataEgzaminu;
        }
        else{
            return "nazwa: "+ nazwa + " prowadzący: " + wykladowca.getImie() + " " + wykladowca.getNazwisko() + " punkty ECTS: " + ECTS + " data Egzaminu: nie wyznaczono";
        }

    }

    @Override
    public void registerObserver(Observer s) {
        studenci.add((Student) s);
    }

    @Override
    public void removeObserver(Observer o) {
        studenci.remove((Student) o);
    }

    @Override
    public void notifyObservers() {
        for (Student student : studenci) {
            student.update();
        }
    }
}

