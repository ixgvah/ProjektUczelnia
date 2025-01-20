package GUI;

import projekt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TabelkaKursy extends JTable {
    public TabelkaKursy() {
        List<String[]> kursy = new ArrayList<>();
        for(Kurs k: Kursy.getInstance().getKursy()){
            kursy.add(new String[]{k.getNazwa(), k.getWykladowca().getNazwisko(), k.getWykladowca().getImie(), String.valueOf(k.getECTS())});
        }
        String[] kolumny = {"nazwa", "nazwisko wykładowcy", "imie wykładowcy", "ECTS"};
        DefaultTableModel model = new DefaultTableModel(kursy.toArray(new String[0][]), kolumny);
        this.setModel(model);
    }
}
