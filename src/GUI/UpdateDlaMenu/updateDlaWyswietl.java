package GUI.UpdateDlaMenu;

import GUI.ExtraMenu;
import GUI.NameButton;

import javax.swing.*;
import java.awt.*;

public class updateDlaWyswietl {
    public void update() {
        ExtraMenu em = new ExtraMenu();
        em.removeAll();

        // Dodanie nowych przycisków
        NameButton b1 = new NameButton("Osoby");
        NameButton b2 = new NameButton("Studenci");
        NameButton b3 = new NameButton("Pracownicy");
        NameButton b4 = new NameButton("Kursy");

        // Dodanie przycisków do panelu
        em.add(Box.createHorizontalStrut(70));
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);// Odstęp przed pierwszym przyciskiem
        em.add(b1);
        em.add(Box.createHorizontalStrut(70));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        em.add(b2);
        em.add(Box.createHorizontalStrut(70)); // Odstęp między przyciskami
        em.add(b3);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        em.add(Box.createHorizontalStrut(70)); // Odstęp po ostatnim przycisku
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        em.add(b4);

        // Odświeżenie panelu, aby zmiany były widoczne
        em.revalidate();
        em.repaint();
    }

}

