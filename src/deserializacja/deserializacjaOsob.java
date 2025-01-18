package deserializacja;

import projekt.Osoba;
import projekt.Uczelnia;

import java.io.*;

public class deserializacjaOsob implements Deserializuj {
    @Override
    public void wykonajDeserializacje() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Osoby.txt"))){
            while (true) {
                try {
                    Osoba osoba = (Osoba) in.readObject();
                    Uczelnia.getInstance().add(osoba);
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
