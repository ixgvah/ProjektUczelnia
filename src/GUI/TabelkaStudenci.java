package GUI;

import projekt.Osoba;
import projekt.Student;
import projekt.Uczelnia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TabelkaStudenci extends JTable {
    public TabelkaStudenci() {
        List<String[]> osoby = new ArrayList<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof Student){
                osoby.add(new String[]{o.getImie(), o.getNazwisko(), o.getPesel(), String.valueOf(o.getWiek()), o.getPlec(), ((Student) o).getIndeks(), String.valueOf(((Student) o).getRok()), String.valueOf(((Student) o).isErasmus()), String.valueOf(((Student) o).isStopien()), String.valueOf(((Student) o).isStacjonarnie())});
            }
        }
        String[] kolumny = {"Imie", "Nazwisko", "Pesel", "Wiek", "Plec", "indeks", "rok", "erasmus", "stopien", "stacjonarnie"};
        DefaultTableModel model = new DefaultTableModel(osoby.toArray(new String[0][]), kolumny);
        this.setModel(model);
    }
}
