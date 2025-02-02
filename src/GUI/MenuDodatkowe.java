package GUI;

import javax.swing.*;
import java.awt.*;


public class MenuDodatkowe extends JPanel {
    public MenuDodatkowe() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(new Color(249, 212, 212));
        this.setPreferredSize(new Dimension(210, 50));
    }

    public void updateDlaWyswietlania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        // Dodanie nowych przycisków
        PrzyciskNazwa b1 = new PrzyciskNazwa("Osoby");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Studenci");
        PrzyciskNazwa b3 = new PrzyciskNazwa("Pracownicy");
        PrzyciskNazwa b4 = new PrzyciskNazwa("Kursy");

        // Dodanie przycisków do panelu
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            PanelWyniki.getInstance().wyswietlOsoby();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(10));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().wyswietlStudentow();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(10)); // Odstęp między przyciskami
        b3.setAction(() -> {
            PanelWyniki.getInstance().wyswietlPracownikow();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalStrut(10)); // Odstęp po ostatnim przycisku
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAction(() -> {
            PanelWyniki.getInstance().wyswietlKursy();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b4);
        this.add(Box.createHorizontalStrut(10));

        // Odświeżenie panelu, aby zmiany były widoczne
        this.revalidate();
        this.repaint();
    }

    public void updateDlaTworzenia() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("Studenta");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Pracownika b.dydaktycznego");
        PrzyciskNazwa b3 = new PrzyciskNazwa("Pracownika administracyjnego");
        PrzyciskNazwa b4 = new PrzyciskNazwa("Kursy");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            PanelWyniki.getInstance().tworzenieStudenta();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        b2.setAction(() -> {
            PanelWyniki.getInstance().tworzeniPracownika();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(Box.createHorizontalStrut(10));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b2);
        this.add(Box.createHorizontalStrut(10));// Odstęp między przyciskami
        b3.setAction(() -> {
            PanelWyniki.getInstance().tworzeniePracownikaAdministracyjnego();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalStrut(10)); // Odstęp po ostatnim przycisku
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAction(()-> {
            PanelWyniki.getInstance().tworzenieKursu();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b4);

        this.revalidate();
        this.repaint();
    }

    public void updateDlaWyszukiwania() {
        this.removeAll();

        PrzyciskNazwa b1 = new PrzyciskNazwa("Studenta");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Pracownika");
        PrzyciskNazwa b3 = new PrzyciskNazwa("Kurs");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            PanelWyniki.getInstance().wyszukiwanieStudentow();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().wyszukiwaniePracownikow();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(50));
        b3.setAction(() -> {
            PanelWyniki.getInstance().wyszukiwanieKursow();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

    public void updateDlaZapisywania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("Osoby");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Kursy");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            PanelWyniki.getInstance().zapiszOsoby();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().zapiszKursy();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

    public void updateDlaUsuwania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("Studenta");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Pracownika");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);// Odstęp przed pierwszym przyciskiem
        b1.setAction(() -> {
            PanelWyniki.getInstance().usunStudenta();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().usunWykladowcow();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(50)); // Odstęp między przyciskami
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }
    public void updateDlaZapisywaniaNaKurs(){
        this.removeAll();
        this.repaint();
        PanelWyniki.getInstance().zapiszNaKurs();
        PanelWyniki.getInstance().setVisible(true);
    }
    public void updateDlaDatyEgzaminu(){
        this.removeAll();
        this.repaint();
        PanelWyniki.getInstance().wyznaczDate();
        PanelWyniki.getInstance().setVisible(true);
    }

    public void updateDlaSortowania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("Osoby");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Kursy");

        b1.setAction(() -> {
            this.wyswietlMenuDlaSortowaniaOsob();
        });
        b2.setAction(() -> {
            this.wyswietlDlaSortowaniaKursow();
        });


        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b2);
        this.add(Box.createHorizontalGlue());


        this.revalidate();
        this.repaint();
    }

    public void updateDlaUsuwaniaDuplikatow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("Studenci");
        PrzyciskNazwa b2 = new PrzyciskNazwa("Pracownicy");

        this.add(Box.createHorizontalGlue());
        b1.setAction(() -> {
            PanelWyniki.getInstance().duplikatyStudenci();
            PanelWyniki.getInstance().setVisible(true);
        });
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().duplikatyPracownicy();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalGlue());


        this.revalidate();
        this.repaint();
    }
    //________________________________________________________________________________
    //dodatkowe opcje wyswietlania jako rozszerzenie sortowania duplikatow

    public void wyswietlMenuDlaSortowaniaOsob(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("po nazwisku");
        PrzyciskNazwa b2 = new PrzyciskNazwa("po nazwisku i imieniu");
        PrzyciskNazwa b3 = new PrzyciskNazwa("po nazwisku i wieku");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            PanelWyniki.getInstance().sortujNazwiska();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().sortujNazwiskoImie();
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(50));
        b3.setAction(() -> {
            PanelWyniki.getInstance().sortujNazwiskaWiek();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

    public void wyswietlDlaSortowaniaKursow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        PrzyciskNazwa b1 = new PrzyciskNazwa("po liczbie punktów ECTS");
        PrzyciskNazwa b2 = new PrzyciskNazwa("po nazwisku prowadzącego");
        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);// Odstęp przed pierwszym przyciskiem
        b1.setAction(() -> {
            PanelWyniki.getInstance().sortujECTS();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            PanelWyniki.getInstance().sortujNazwiskoProwadzacego();
            PanelWyniki.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(50)); // Odstęp między przyciskami
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

}



