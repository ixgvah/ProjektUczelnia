package GUI;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

class MenuLeftPanel extends JPanel {
    public MenuLeftPanel(ExtraMenu extraMenu) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(249, 212, 212));
        this.setPreferredSize(new Dimension(210, 200));

        JLabel title = new JLabel("Menu główne");
        title.setFont(new Font("Serif", Font.BOLD, 23));
        title.setForeground(new Color(153, 0, 0));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createVerticalStrut(10)); // Odstęp nad tytułem
        this.add(title);
        this.add(Box.createVerticalStrut(10)); // Odstęp pod tytułem

        JPanel panelPrzyciskow = new JPanel();
        panelPrzyciskow.setBackground(new Color(249, 212, 212));
        panelPrzyciskow.setLayout(new BoxLayout(panelPrzyciskow, BoxLayout.Y_AXIS));

        // Przyciski
        MainMenuButton przycisk1 = new MainMenuButton("Wyświetl");
        przycisk1.setAction(() -> {
            extraMenu.updateDlaWyswietlania(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk1);
        panelPrzyciskow.add(Box.createVerticalStrut(10)); // Odstęp 10px

        MainMenuButton przycisk2 = new MainMenuButton("Utwórz");
        panelPrzyciskow.add(przycisk2);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk3 = new MainMenuButton("Wyszukaj");
        panelPrzyciskow.add(przycisk3);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk4 = new MainMenuButton("Zapisz");
        panelPrzyciskow.add(przycisk4);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk5 = new MainMenuButton("Usuń");
        panelPrzyciskow.add(przycisk5);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk6 = new MainMenuButton("Zapisz studenta na kurs");
        panelPrzyciskow.add(przycisk6);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk7 = new MainMenuButton("Wyznacz date egzaminu");
        panelPrzyciskow.add(przycisk7);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk8 = new MainMenuButton("Sortuj");
        panelPrzyciskow.add(przycisk8);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        MainMenuButton przycisk9 = new MainMenuButton("Usuń duplikaty");
        panelPrzyciskow.add(przycisk9);
        panelPrzyciskow.add(Box.createVerticalStrut(10));

        JScrollPane slider = new JScrollPane(panelPrzyciskow);
        slider.setPreferredSize(new Dimension(200, 250));
        slider.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(slider);
    }
}
