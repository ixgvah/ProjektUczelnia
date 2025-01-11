package GUI;

import javax.swing.*;
import java.awt.*;


class ExtraMenu extends JPanel {
    public ExtraMenu() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(new Color(249, 212, 212));
        this.setPreferredSize(new Dimension(210, 50));
    }

    public void updateDlaWyswietlania() {
        this.removeAll();

        // Dodanie nowych przycisków
        MainMenuButton b1 = new MainMenuButton("Osoby");
        MainMenuButton b2 = new MainMenuButton("Studenci");
        MainMenuButton b3 = new MainMenuButton("Pracownicy");
        MainMenuButton b4 = new MainMenuButton("Kursy");

        // Dodanie przycisków do panelu
        this.add(Box.createHorizontalStrut(70)); // Odstęp przed pierwszym przyciskiem
        this.add(b1, BorderLayout.WEST);
        this.add(Box.createHorizontalStrut(70));
        this.add(b2, BorderLayout.CENTER);
        this.add(Box.createHorizontalStrut(70)); // Odstęp między przyciskami
        this.add(b3, BorderLayout.CENTER);
        this.add(Box.createHorizontalStrut(70)); // Odstęp po ostatnim przycisku
        this.add(b4, BorderLayout.EAST);

        // Odświeżenie panelu, aby zmiany były widoczne
        this.revalidate();
        this.repaint();
    }

}

