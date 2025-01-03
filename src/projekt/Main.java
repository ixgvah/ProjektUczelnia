package projekt;

import Menu.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Uczelnia uczelnia = Uczelnia.getInstance();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("osoby.txt"))){
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

    Kursy kursy = Kursy.getInstance();



        System.out.println("Wykonywanie programu możesz przerwac w każdej chwili wisująć STOP");
        Menu menu = new Menu1() {
            @Override
            public void dodajObiekt() {

            }

            public void wyswietlMenu() {
                super.wyswietlMenu();
            }
        };

        menu.wyswietlMenu();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Osoby.txt"))) {
            for(int i=0; i<uczelnia.getUczelnia().size(); i++){
                oos.writeObject(uczelnia.getUczelnia().get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Serializacja nie powiodła się. ");
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Kursy.txt"))) {
            for(int i=0; i<kursy.getKursy().size(); i++){
                oos.writeObject(kursy.getKursy().get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
