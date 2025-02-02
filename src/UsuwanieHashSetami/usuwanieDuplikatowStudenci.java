package UsuwanieHashSetami;

import projekt.Osoba;
import projekt.Student;
import projekt.Uczelnia;

import java.util.ArrayList;
import java.util.HashSet;

public class usuwanieDuplikatowStudenci implements UsunHashSetami{
    @Override
    public ArrayList<Osoba> usunieteDuplikaty() {
        HashSet<Osoba> studenci = new HashSet<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof Student){
                studenci.add((Student)o);
            }
        }
        ArrayList<Osoba> wynik = new ArrayList<>(studenci);
//        for(Osoba o: wynik){
//            System.out.println(o.toString());
//        }
        return wynik;
    }
}
