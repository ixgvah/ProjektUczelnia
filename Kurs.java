package projekt;

public class Kurs {
    private String nazwa;
    private PracownikBadawczoDydaktyczny wykladowca;
    private int ECTS;

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
    public String toString() {
        return "nazwa: "+ nazwa + " prowadzący: " + wykladowca.getImie() + " " + wykladowca.getNazwisko() + " punkty ECTS: " + ECTS;
    }
}
