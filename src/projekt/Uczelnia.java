package projekt;

import java.util.ArrayList;

public class Uczelnia{
    private ArrayList<Osoba> uczelnia;
    public static Uczelnia instance;

    public Uczelnia() {
        uczelnia = new ArrayList<Osoba>();
    }

    public static void setInstace(Uczelnia instace) {
        Uczelnia.instance = instace;
    }

    public ArrayList<Osoba> getUczelnia() {
        return uczelnia;
    }
    public void setUczelnia(ArrayList<Osoba> uczelnia) {
        this.uczelnia = uczelnia;
    }

    public static void setInstance(Uczelnia instance) {
        Uczelnia.instance = instance;
    }
    public static Uczelnia getInstance() {
        if (instance == null) {
            instance = new Uczelnia();
        }
        return instance;
    }

    public String toString(){
        String s = " ";
        for(Osoba o: uczelnia){
            s+=o.toString()+"\n";
        }
        return s;
    }

    public void wypiszStudentow(){
        for(int i=0; i<uczelnia.size(); i++){
            if(uczelnia.get(i) instanceof Student){
                System.out.println(uczelnia.get(i));
            }
        }
    }
    public void wypiszPracownikow(){
        for(int i=0; i<uczelnia.size(); i++){
            if(uczelnia.get(i) instanceof PracownikUczelni){
                System.out.println(uczelnia.get(i));
            }
        }
    }
    public void wypiszWykladowcow(){
        for(int i=0; i<uczelnia.size(); i++){
            if(uczelnia.get(i) instanceof PracownikBadawczoDydaktyczny){
                System.out.println(uczelnia.get(i));
            }
        }
    }
    public ArrayList<Student> wyszukajStudenta(String nazwaPola, String wartosc) {
        ArrayList<Student> wyniki = new ArrayList<>();
        for (Osoba osoba : uczelnia) {
            if(osoba instanceof Student) {
                Student student = (Student) osoba;
                switch (nazwaPola.toUpperCase()) {
                    case "IMIE":
                        if (student.getImie().equalsIgnoreCase(wartosc)) {
                            wyniki.add(student);
                        }
                        break;
                    case "NAZWISKO":
                        if (student.getNazwisko().equalsIgnoreCase(wartosc)) {
                            wyniki.add(student);
                        }
                        break;
                    case "PESEL":
                        if(student.getPesel().equalsIgnoreCase(wartosc)) {
                            wyniki.add(student);
                        }
                        break;
                    case "INDEKS":
                        if (student.getIndeks().equals(wartosc)) {
                            wyniki.add(student);
                        }
                        break;
                    case "ROK":
                        if(Integer.toString(student.getRok()).equals(wartosc)) {
                            wyniki.add(student);
                        }
                        break;
                    case "NAZWA KURSU":
                        for(Kurs kurs: student.getWybraneKursy()){
                            if(kurs.getNazwa().equals(wartosc)) {
                                wyniki.add(student);
                                break;
                            }
                        }
                    default:
                        System.out.println("Nieprawidłowe pole: " + nazwaPola);
                        return wyniki;
                }
            }

        }

        return wyniki;
    }
    public ArrayList<PracownikUczelni> wyszukajPracownika(String nazwaPola, String wartosc) {
        ArrayList<PracownikUczelni> wyniki = new ArrayList<>();
        for (Osoba osoba : uczelnia) {
            if(osoba instanceof PracownikUczelni) {
                PracownikUczelni pracownik = (PracownikUczelni) osoba;
                switch (nazwaPola.toUpperCase()) {
                    case "IMIE":
                        if (pracownik.getImie().equalsIgnoreCase(wartosc)) {
                            wyniki.add(pracownik);
                        }
                        break;
                    case "NAZWISKO":
                        if(pracownik.getNazwisko().equalsIgnoreCase(wartosc)) {
                            wyniki.add(pracownik);
                        }
                        break;
                    case "STANOWISKO":
                        if(pracownik.getStanowisko().equalsIgnoreCase(wartosc)) {
                            wyniki.add(pracownik);
                        }
                        break;
                    case "PESEL":
                        if(pracownik.getPesel().equalsIgnoreCase(wartosc)) {
                            wyniki.add(pracownik);
                        }
                        break;
                    case "STAZ PRACY":
                        int staz = Integer.parseInt(wartosc);
                        if(pracownik.getStaz()==staz){
                            wyniki.add(pracownik);
                        }
                        break;
                    case "LICZBA NADGODZIN":
                        if(pracownik instanceof PracownikAdministracyjny){
                            PracownikAdministracyjny x = (PracownikAdministracyjny) pracownik;
                            int liczbaNadgodzin= Integer.parseInt(wartosc);
                            if(x.getLiczbaNadgodzin()==liczbaNadgodzin){
                                wyniki.add(pracownik);
                            }
                        }
                        break;
                    case "PENSJA":
                        double pensja = Double.parseDouble(wartosc);
                            if(pracownik.getPensja() == pensja){
                                wyniki.add(pracownik);
                            }
                            break;
                default:
                    System.out.println("Nieprawidłowe pole: " + nazwaPola);
                    return wyniki;
                }
            }
        }
        return wyniki;
    }
    public boolean czyProwadzacyWLiscie(PracownikUczelni k) {
        if (k instanceof PracownikBadawczoDydaktyczny){
            PracownikBadawczoDydaktyczny p = (PracownikBadawczoDydaktyczny) k;
        }
        for (int i = 0; i < uczelnia.size(); i++) {
                if (uczelnia.get(i).equals(k)) {
                    return true;
                }
        }
        return false;
    }

    public void add(Osoba osoba) {
        uczelnia.add(osoba);
    }

    public void usunOsobe(Osoba o){
        Uczelnia.getInstance().getUczelnia().remove(o);
    }
}
