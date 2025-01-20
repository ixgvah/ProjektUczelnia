package GUI;

import projekt.Osoba;
import projekt.PracownikUczelni;
import projekt.Student;
import projekt.Uczelnia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class TabelkaPracownicy extends JTable {
    public TabelkaPracownicy() {
            List<String[]> osoby = new ArrayList<>();
            for(Osoba o: Uczelnia.getInstance().getUczelnia()){
                if(o instanceof PracownikUczelni){
                    osoby.add(new String[]{o.getImie(), o.getNazwisko(), o.getPesel(), String.valueOf(o.getWiek()), o.getPlec(), ((PracownikUczelni) o).getStanowisko(), String.valueOf(((PracownikUczelni) o).getPensja())});
                }
            }
            String[] kolumny = {"Imie", "Nazwisko", "Pesel", "Wiek", "Plec", "stanowisko", "pensja"};
            DefaultTableModel model = new DefaultTableModel(osoby.toArray(new String[0][]), kolumny);
            this.setModel(model);
        }
}
