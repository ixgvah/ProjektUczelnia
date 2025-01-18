package deserializacja;

import projekt.Kurs;
import projekt.Kursy;

import java.io.*;

public class deserializacjaKursow implements Deserializuj {
    public void wykonajDeserializacje() {
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
    }
}
