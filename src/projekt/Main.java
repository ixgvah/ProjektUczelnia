package projekt;

import GUI.MainFrame;
import deserializacja.deserializacjaKursow;
import deserializacja.deserializacjaOsob;

public class Main {
    public static void main(String[] args) {

        deserializacjaOsob so = new deserializacjaOsob();
        so.wykonajDeserializacje();

        deserializacjaKursow sk = new deserializacjaKursow();
        sk.wykonajDeserializacje();

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
