package Serializacja;

import projekt.Uczelnia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacjaKursow implements WykonajSerializacje {
    public void wykonajSerializacje() {
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
    }
}
