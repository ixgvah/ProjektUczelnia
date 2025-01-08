package UsuwanieHashSetami;

import projekt.Osoba;
import projekt.Student;
import projekt.Uczelnia;

import java.util.HashSet;

public class usuwanieDuplikatowStudenci implements UsunHashSetami{
    @Override
    public void usunieteDuplikaty() {
        HashSet<Student> studenci = new HashSet<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof Student){
                studenci.add((Student)o);
            }
        }
        for(Student s: studenci){
            System.out.println(s);
        }
    }
}
