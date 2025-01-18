package GUI;

import javax.swing.*;
import java.awt.*;


public class ExtraMenu extends JPanel {
    public ExtraMenu() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(new Color(249, 212, 212));
        this.setPreferredSize(new Dimension(210, 50));
    }

    public void updateDlaWyswietlania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        // Dodanie nowych przycisków
        NameButton b1 = new NameButton("Osoby");
        NameButton b2 = new NameButton("Studenci");
        NameButton b3 = new NameButton("Pracownicy");
        NameButton b4 = new NameButton("Kursy");

        // Dodanie przycisków do panelu
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            ResultPanel.getInstance().wyswietlOsoby();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(10));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            ResultPanel.getInstance().wyswietlStudentow();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(10)); // Odstęp między przyciskami
        b3.setAction(() -> {
            ResultPanel.getInstance().wyswietlPracownikow();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalStrut(10)); // Odstęp po ostatnim przycisku
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAction(() -> {
            ResultPanel.getInstance().wyswietlKursy();
            ResultPanel.getInstance().setVisible(true);
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

        NameButton b1 = new NameButton("Studenta");
        NameButton b2 = new NameButton("Pracownika b.dydaktycznego");
        NameButton b3 = new NameButton("Pracownika administracyjnego");
        NameButton b4 = new NameButton("Kursy");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            ResultPanel.getInstance().tworzenieStudenta();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b1);
        b2.setAction(() -> {
            ResultPanel.getInstance().tworzeniPracownika();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(Box.createHorizontalStrut(10));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b2);
        this.add(Box.createHorizontalStrut(10));// Odstęp między przyciskami
        b3.setAction(() -> {
            ResultPanel.getInstance().tworzeniePracownikaAdministracyjnego();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalStrut(10)); // Odstęp po ostatnim przycisku
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAction(()-> {
            ResultPanel.getInstance().tworzenieKursu();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b4);

        this.revalidate();
        this.repaint();
    }

    public void updateDlaWyszukiwania() {
        this.removeAll();

        NameButton b1 = new NameButton("Studenta");
        NameButton b2 = new NameButton("Pracownika");
        NameButton b3 = new NameButton("Kurs");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            ResultPanel.getInstance().wyszukiwanieStudentow();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            ResultPanel.getInstance().wyszukiwaniePracownikow();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalStrut(50));
        b3.setAction(() -> {
            ResultPanel.getInstance().wyszukiwanieKursow();
            ResultPanel.getInstance().setVisible(true);
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

        NameButton b1 = new NameButton("Osoby");
        NameButton b2 = new NameButton("Kursy");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAction(() -> {
            ResultPanel.getInstance().zapiszOsoby();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAction(() -> {
            ResultPanel.getInstance().zapiszKursy();
            ResultPanel.getInstance().setVisible(true);
        });
        this.add(b2);
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

    public void updateDlaUsuwania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        NameButton b1 = new NameButton("Studenta");
        NameButton b2 = new NameButton("Pracownika");
        NameButton b3 = new NameButton("Kursy");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);// Odstęp przed pierwszym przyciskiem
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b2);
        this.add(Box.createHorizontalStrut(50)); // Odstęp między przyciskami
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }
    public void updateDlaZapisywaniaNaKurs(){
        this.removeAll();
        this.repaint();
    }
    public void updateDlaDatyEgzaminu(){
        this.removeAll();
        this.repaint();
    }

    public void updateDlaSortowania() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        NameButton b1 = new NameButton("Osoby");
        NameButton b2 = new NameButton("Kursy");

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

        NameButton b1 = new NameButton("Studenci");
        NameButton b2 = new NameButton("Pracownicy");

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
    //________________________________________________________________________________
    //dodatkowe opcje wyswietlania jako rozszerzenie sortowania duplikatow

    public void wyswietlMenuDlaSortowaniaOsob(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        NameButton b1 = new NameButton("po nazwisku");
        NameButton b2 = new NameButton("po nazwisku i imieniu");
        NameButton b3 = new NameButton("po nazwisku i wieku");

        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);// Odstęp przed pierwszym przyciskiem
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b2);
        this.add(Box.createHorizontalStrut(50)); // Odstęp między przyciskami
        this.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

    public void wyswietlDlaSortowaniaKursow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        NameButton b1 = new NameButton("po liczbie punktów ECTS");
        NameButton b2 = new NameButton("po nazwisku prowadzącego");
        this.add(Box.createHorizontalGlue());
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);// Odstęp przed pierwszym przyciskiem
        this.add(b1);
        this.add(Box.createHorizontalStrut(50));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(b2);
        this.add(Box.createHorizontalStrut(50)); // Odstęp między przyciskami
        this.add(Box.createHorizontalGlue());

        this.revalidate();
        this.repaint();
    }

}



