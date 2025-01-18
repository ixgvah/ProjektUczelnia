package Serializacja;

import projekt.Kursy;
import projekt.Uczelnia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacjaOsob implements WykonajSerializacje {
    public void wykonajSerializacje() {
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
    }
}
