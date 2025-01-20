package GUI;

import projekt.Osoba;
import projekt.Uczelnia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TabelkaOsoby extends JTable {
    public TabelkaOsoby() {
        List<String[]> osoby = new ArrayList<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            osoby.add(new String[]{o.getImie(), o.getNazwisko(), o.getPesel(), String.valueOf(o.getWiek()), o.getPlec()});
        }
        String[] kolumny = {"Imie", "Nazwisko", "Pesel", "Wiek", "Plec"};
        DefaultTableModel model = new DefaultTableModel(osoby.toArray(new String[0][]), kolumny);
        this.setModel(model);
    }
}
