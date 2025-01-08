package Menu;

import projekt.Kurs;
import projekt.Kursy;
import projekt.Osoba;
import projekt.Uczelnia;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuSerializacjiDeserializacji implements Menu {
    @Override
    public void wyswietlMenu() {
        System.out.println("1. Serializuj osoby. ");
        System.out.println("2. Serializuj kursy. ");
        System.out.println("3. Derializuj osoby. ");
        System.out.println("4. Deserializuj kursy. ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()) {
            case "1":
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Osoby.txt"))) {
                    Uczelnia uczelnia = Uczelnia.getInstance();
                    for(int i=0; i<uczelnia.getUczelnia().size(); i++){
                        oos.writeObject(uczelnia.getUczelnia().get(i));
                    }
                    System.out.println("Serializacja zakończona sukcesem. ");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Serializacja nie powiodła się. ");
                }
                break;
            case "2":
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Kursy.txt"))) {
                    Kursy kursy = Kursy.getInstance();
                    for(int i=0; i<kursy.getKursy().size(); i++){
                        oos.writeObject(kursy.getKursy().get(i));
                    }
                    System.out.println("Serializacja zakończona sukcesem. ");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Serializacja nie powiodła się. ");
                }
                break;
            case "3":
                ArrayList<Osoba> osoby = new ArrayList<>();
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("osoby.txt"))){
                    while (true) {
                        try {
                            Osoba osoba = (Osoba) in.readObject();
                            osoby.add(osoba);
                        } catch (EOFException e) {
                            // Koniec pliku - zakończ pętlę
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
                for(Osoba o: osoby){
                    System.out.println(o);
                }
                break;
            case "4":
                ArrayList<Kurs> kursy = new ArrayList<>();
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Kursy.txt"))){
                    while (true) {
                        try {
                            Kurs kurs = (Kurs) in.readObject();
                            kursy.add(kurs);
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
                for(Kurs kurs: kursy){
                    System.out.println(kurs);
                }
                break;
            default:
                System.out.println("Niepoprawne pole. ");
                break;
        }
    }
}
