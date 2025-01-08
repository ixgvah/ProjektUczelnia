package projekt;

import Menu.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Uczelnia uczelnia = Uczelnia.getInstance();
        Kursy kursy = Kursy.getInstance();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Osoby.txt"))){
            while (true) {
                try {
                    Osoba osoba = (Osoba) in.readObject();
                    uczelnia.add(osoba);
                } catch (EOFException e) {
                     break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Kursy.txt"))){
            while (true) {
                try {
                    Kurs kurs = (Kurs) in.readObject();
                    Kursy.getInstance().dodajKurs(kurs);
                } catch (EOFException e) {
                    break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        PracownikBadawczoDydaktyczny p1 = new PracownikBadawczoDydaktyczny("Przemysław", "Czarnek", "30010547736", "wykladowca", 20, 200, 300);
//        PracownikBadawczoDydaktyczny p2 = new PracownikBadawczoDydaktyczny("Mykola", "Mykola", "42052777321", "wykładowca", 40, 2000, 30);
//        PracownikBadawczoDydaktyczny p3 = new PracownikBadawczoDydaktyczny("Edmund", "Mazur", "73070143133", "wykładowca", 30, 7500, 45);
//        PracownikBadawczoDydaktyczny p4 = new PracownikBadawczoDydaktyczny("Adelajda", "Pawlik", "89042534845", "wykładowca", 5, 3000, 3);
//        PracownikBadawczoDydaktyczny p5 = new PracownikBadawczoDydaktyczny("Oleh", "Grabowski", "55101494391", "wykładowca", 30, 8000, 300);
//        Student s2 = new Student("Michael", "Laskowski", "04273013479", "23846234", 3, true, 2, true);
//        Student s3 = new Student("Marzanna", "Ostrowska", "01293009589", "73236", 1, false, 2, true );
//        Student s4 = new Student("Cecylia", "Wójtowicz", "01293009589", "236432678", 2, false, 2, true );
//        Student s5 = new Student("Piotr", "Pawlik", "05212483975", "37947345", 3, false, 1, true );
//        uczelnia.add(p1);
//        uczelnia.add(p2);
//        uczelnia.add(p3);
//        uczelnia.add(p4);
//        uczelnia.add(p5);
//        Kurs k1 = new Kurs("Analiza", p1, 10);
////        Kurs k2 = new Kurs("Algebra", p2, 8);
////        Kurs k3 = new Kurs("Logika", p3, 7);
////        Kurs k4 = new Kurs("PSIO", p4, 6);
////        Kurs k5 = new Kurs("OSK", p5, 5);
////        Kurs k6 = new Kurs("Fizyka", p1, 4);
////        uczelnia.add(s1);
//        uczelnia.add(s2);
//        uczelnia.add(s3);
//        uczelnia.add(s4);
//        uczelnia.add(s5);
//        s1.dodanieKursu(k1);
//        s1.dodanieKursu(k2);
//        s1.dodanieKursu(k3);
//        s2.dodanieKursu(k4);
//        s2.dodanieKursu(k5);
//        s3.dodanieKursu(k6);
        System.out.println("Wykonywanie programu możesz przerwac w każdej chwili wisująć STOP");
        Menu menu = new MenuGlowne() {
            @Override
            public void dodajObiekt() {

            }

            public void wyswietlMenu() {
                super.wyswietlMenu();
            }
        };

        menu.wyswietlMenu();
    }

}
