package projekt;

import GUI.MainFrame;
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

//        System.out.println("Wykonywanie programu możesz przerwac w każdej chwili wisująć STOP");
//        Menu menu = new MenuGlowne() {
//            @Override
//            public void dodajObiekt() {
//
//            }
//
//            public void wyswietlMenu() {
//                super.wyswietlMenu();
//            }
//        };
//
//        menu.wyswietlMenu();
        MainFrame mf = new MainFrame();

    }
}
