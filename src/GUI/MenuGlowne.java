package GUI;

import deserializacja.deserializacjaKursow;
import deserializacja.deserializacjaOsob;

import javax.swing.*;
import java.awt.*;

public class MenuGlowne extends JPanel {
    public MenuGlowne(MenuDodatkowe menuDodatkowe) {
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
        PrzyciskMenu przycisk1 = new PrzyciskMenu("Wyświetl");
        przycisk1.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaWyswietlania(); // Aktualizacja extraMenu
            menuDodatkowe.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk1);
        panelPrzyciskow.add(Box.createVerticalStrut(20)); // Odstęp 10px

        PrzyciskMenu przycisk2 = new PrzyciskMenu("Utwórz");
        przycisk2.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaTworzenia(); // Aktualizacja extraMenu
            menuDodatkowe.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk2);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk3 = new PrzyciskMenu("Wyszukaj");
        przycisk3.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaWyszukiwania(); // Aktualizacja extraMenu
            menuDodatkowe.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk3);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk4 = new PrzyciskMenu("Zapisz");
        przycisk4.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaZapisywania(); // Aktualizacja extraMenu
            menuDodatkowe.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk4);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk5 = new PrzyciskMenu("Usuń");
        przycisk5.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaUsuwania(); // Aktualizacja extraMenu
            menuDodatkowe.setVisible(true); // Upewniamy się, że jest widoczne
        });
        panelPrzyciskow.add(przycisk5);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk6 = new PrzyciskMenu("Zapisz studenta na kurs");
        przycisk6.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaZapisywaniaNaKurs();
            menuDodatkowe.setVisible(true);
        });
        panelPrzyciskow.add(przycisk6);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk7 = new PrzyciskMenu("Wczytaj dane");
        przycisk7.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            PrzyciskMenu x = new PrzyciskMenu("Kliknij aby wczytać");
            x.addActionListener(e -> {
                deserializacjaOsob so = new deserializacjaOsob();
                so.wykonajDeserializacje();

                deserializacjaKursow sk = new deserializacjaKursow();
                sk.wykonajDeserializacje();
                PanelWyniki.getInstance().removeAll();
                JLabel odp = new JLabel("Wczytano dane");
                odp.setBackground(new Color(247, 239, 239));
                odp.setPreferredSize(new Dimension(100, 20));
                odp.setAlignmentX(Component.CENTER_ALIGNMENT);
                odp.setFont(new Font("Serif", Font.BOLD, 15));
                PanelWyniki.getInstance().add(odp);
                PanelWyniki.getInstance().revalidate();
                PanelWyniki.getInstance().repaint();
            });
            PanelWyniki.getInstance().add(x);

            PanelWyniki.getInstance().revalidate();
            PanelWyniki.getInstance().repaint();
        }
        );
        panelPrzyciskow.add(przycisk7);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk8 = new PrzyciskMenu("Sortuj");
        przycisk8.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaSortowania();
            menuDodatkowe.setVisible(true);
        });
        panelPrzyciskow.add(przycisk8);
        panelPrzyciskow.add(Box.createVerticalStrut(20));

        PrzyciskMenu przycisk9 = new PrzyciskMenu("Usuń duplikaty");
        przycisk9.setAction(() -> {
            PanelWyniki.getInstance().removeAll();
            menuDodatkowe.updateDlaUsuwaniaDuplikatow();
            menuDodatkowe.setVisible(true);
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
