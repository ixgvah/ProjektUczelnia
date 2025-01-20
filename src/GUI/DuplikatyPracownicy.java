package GUI;

import UsuwanieHashSetami.usuwanieDuplikatowPracownicy;
import projekt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplikatyPracownicy extends JTable {
    public DuplikatyPracownicy() {
        usuwanieDuplikatowPracownicy usuwanie = new usuwanieDuplikatowPracownicy();
        ArrayList<Osoba> bezDuplikatow = usuwanie.usunieteDuplikaty();
            List<String[]> osoby = new ArrayList<>();
            for(Osoba o: bezDuplikatow){
                if(o instanceof PracownikUczelni){
                    osoby.add(new String[]{o.getImie(), o.getNazwisko(), o.getPesel(), String.valueOf(o.getWiek()), o.getPlec(), ((PracownikUczelni) o).getStanowisko(), String.valueOf(((PracownikUczelni) o).getPensja())});
                }
            }
            String[] kolumny = {"Imie", "Nazwisko", "Pesel", "Wiek", "Plec", "stanowisko", "pensja"};
            DefaultTableModel model = new DefaultTableModel(osoby.toArray(new String[0][]), kolumny);
            this.setModel(model);

    }
}
