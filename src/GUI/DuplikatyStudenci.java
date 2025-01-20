package GUI;

import UsuwanieHashSetami.usuwanieDuplikatowPracownicy;
import UsuwanieHashSetami.usuwanieDuplikatowStudenci;
import projekt.Osoba;
import projekt.Student;
import projekt.Uczelnia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class DuplikatyStudenci extends JTable {
    public DuplikatyStudenci() {
        usuwanieDuplikatowStudenci usuwanie = new usuwanieDuplikatowStudenci();
        ArrayList<Osoba> bezDuplikatow = usuwanie.usunieteDuplikaty();
        List<String[]> osoby = new ArrayList<>();
        for(Osoba o: bezDuplikatow){
            osoby.add(new String[]{o.getImie(), o.getNazwisko(), o.getPesel(), String.valueOf(o.getWiek()), o.getPlec(), ((Student) o).getIndeks(), String.valueOf(((Student) o).getRok()), String.valueOf(((Student) o).isErasmus()), String.valueOf(((Student) o).isStopien()), String.valueOf(((Student) o).isStacjonarnie())});
        }

        String[] kolumny = {"Imie", "Nazwisko", "Pesel", "Wiek", "Indeks", "Rok", "Erasmus", "Stopien", "Stacjonarnie"};
        DefaultTableModel model = new DefaultTableModel(osoby.toArray(new String[0][]), kolumny);
        this.setModel(model);
    }

}
