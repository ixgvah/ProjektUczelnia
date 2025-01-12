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
        panelPrzyciskow.add(Box.createHorizontalGlue());


        // Przyciski
        MainMenuButton przycisk1 = new MainMenuButton("Wyświetl");
        przycisk1.setAction(() -> {
            extraMenu.updateDlaWyswietlania(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk1);
        panelPrzyciskow.add(Box.createVerticalStrut(20)); // Odstęp 10px

        MainMenuButton przycisk2 = new MainMenuButton("Utwórz");
        przycisk2.setAction(() -> {
            extraMenu.updateDlaTworzenia(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk2);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk3 = new MainMenuButton("Wyszukaj");
        przycisk3.setAction(() -> {
            extraMenu.updateDlaWyszukiwania(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk3);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk4 = new MainMenuButton("Zapisz");
        przycisk4.setAction(() -> {
            extraMenu.updateDlaZapisywania(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk4);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk5 = new MainMenuButton("Usuń");
        przycisk5.setAction(() -> {
            extraMenu.updateDlaUsuwania(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk5);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk6 = new MainMenuButton("Zapisz studenta na kurs");
        przycisk6.setAction(() -> {
            extraMenu.updateDlaZapisywaniaNaKurs();
            extraMenu.setVisible(true);
        });
        panelPrzyciskow.add(przycisk6);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk7 = new MainMenuButton("Wyznacz date egzaminu");
        przycisk7.setAction(() -> {
            extraMenu.updateDlaDatyEgzaminu();
            extraMenu.setVisible(true);
        }
        );
        panelPrzyciskow.add(przycisk7);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk8 = new MainMenuButton("Sortuj");
        przycisk8.setAction(() -> {
            extraMenu.updateDlaSortowania();
            extraMenu.setVisible(true);
        });
        panelPrzyciskow.add(przycisk8);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        MainMenuButton przycisk9 = new MainMenuButton("Usuń duplikaty");
        przycisk9.setAction(() -> {
            extraMenu.updateDlaUsuwaniaDuplikatow(); // Aktualizacja extraMenu
            extraMenu.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk9);
        panelPrzyciskow.add(Box.createHorizontalGlue());

        JScrollPane slider = new JScrollPane(panelPrzyciskow);
        slider.setPreferredSize(new Dimension(200, 250));
        slider.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        slider.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JScrollBar verticalScrollBar = slider.getVerticalScrollBar();
        verticalScrollBar.setBackground(new Color(249, 212, 212)); // Kolor tła paska
        verticalScrollBar.setForeground(new Color(249, 212, 212));
        this.add(slider);
    }
}
