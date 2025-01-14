package GUI.tworzenie;

import GUI.ResultPanel;
import GUI.TekstWyniku;
import GUI.WyborTakNie;
import projekt.Student;
import projekt.Uczelnia;

import javax.swing.*;
import java.awt.*;

public class tworzenieStudenta implements stworzObiekt{
    public void tworzObiekt() {
        ResultPanel panelRe = ResultPanel.getInstance();
        panelRe.removeAll();
        panelRe.setLayout(new BoxLayout(panelRe, BoxLayout.Y_AXIS));
        panelRe.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj imie studenta: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        panelRe.add(polecenie);
        panelRe.add(Box.createVerticalStrut(10));
        TekstWyniku imie = new TekstWyniku();
        panelRe.add(imie);
        panelRe.add(Box.createVerticalStrut(10));

        JLabel polecenie2 = new JLabel("Podaj nazwisko studenta: ");
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie2.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie2);
        panelRe.add(Box.createVerticalStrut(10));
        TekstWyniku nazwisko = new TekstWyniku();
        panelRe.add(nazwisko);

        JLabel polecenie3 = new JLabel("Podaj numer pesel studenta: ");
        polecenie3.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie3.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie3);
        panelRe.add(Box.createVerticalStrut(10));
        TekstWyniku pesel = new TekstWyniku();
        panelRe.add(pesel);

        JLabel polecenie4 = new JLabel("Podaj numer indeksu studenta: ");
        polecenie4.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie4.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie4);
        panelRe.add(Box.createVerticalStrut(10));
        TekstWyniku indeks = new TekstWyniku();
        panelRe.add(indeks);

        JLabel polecenie5 = new JLabel("Podaj rok studenta: ");
        polecenie5.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie5.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie5);
        panelRe.add(Box.createVerticalStrut(10));
        TekstWyniku rok = new TekstWyniku();
        panelRe.add(rok);

        JLabel polecenie6 = new JLabel("Czy student jest z erasmusa? ");
        polecenie6.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie6.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie6);
        panelRe.add(Box.createVerticalStrut(10));
        WyborTakNie erasmus = new WyborTakNie();
        panelRe.add(erasmus);

        JLabel polecenie7 = new JLabel("Podaj stopień studenta: ");
        polecenie7.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie7.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie7);
        panelRe.add(Box.createVerticalStrut(10));
        TekstWyniku stopien = new TekstWyniku();
        panelRe.add(stopien);

        JLabel polecenie8 = new JLabel("Czy student uczy się stacjonarnie? ");
        polecenie8.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie8.setBackground(new Color(247, 239, 239));
        panelRe.add(polecenie8);
        panelRe.add(Box.createVerticalStrut(10));
        WyborTakNie stacjonarnie = new WyborTakNie();
        panelRe.add(stacjonarnie);
        panelRe.add(Box.createVerticalStrut(10));

        JButton dodaj = new JButton("Dodaj studenta");
        dodaj.setBackground(new Color(242, 223, 223));
        dodaj.setForeground(new Color(102, 0, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> Uczelnia.getInstance().add(new Student(imie.getText(), nazwisko.getText(), pesel.getText(), indeks.getText(), Integer.parseInt(rok.getText()), erasmus.wynik(), Integer.parseInt(stopien.getText()), stacjonarnie.wynik())));
        panelRe.add(dodaj);

        panelRe.revalidate();
        panelRe.repaint();

    }
}
