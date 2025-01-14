package GUI;

import projekt.PracownikBadawczoDydaktyczny;
import projekt.Student;
import projekt.Uczelnia;

import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    private static ResultPanel instance;
    public ResultPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        this.setPreferredSize(new Dimension(500, 500));
        this.setVisible(true);
    }

    public static ResultPanel getInstance() {
        if (instance == null) {
            instance = new ResultPanel();
        }
        return instance;
    }

    public void tworzenieStudenta(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj imie studenta: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku imie = new TekstWyniku();
        this.add(imie);
        this.add(Box.createVerticalStrut(10));

        JLabel polecenie2 = new JLabel("Podaj nazwisko studenta: ");
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie2.setBackground(new Color(247, 239, 239));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku nazwisko = new TekstWyniku();
        this.add(nazwisko);

        JLabel polecenie3 = new JLabel("Podaj numer pesel studenta: ");
        polecenie3.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie3.setBackground(new Color(247, 239, 239));
        this.add(polecenie3);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku pesel = new TekstWyniku();
        this.add(pesel);

        JLabel polecenie4 = new JLabel("Podaj numer indeksu studenta: ");
        polecenie4.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie4.setBackground(new Color(247, 239, 239));
        this.add(polecenie4);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku indeks = new TekstWyniku();
        this.add(indeks);

        JLabel polecenie5 = new JLabel("Podaj rok studenta: ");
        polecenie5.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie5.setBackground(new Color(247, 239, 239));
        this.add(polecenie5);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku rok = new TekstWyniku();
        this.add(rok);

        JLabel polecenie6 = new JLabel("Czy student jest z erasmusa? ");
        polecenie6.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie6.setBackground(new Color(247, 239, 239));
        this.add(polecenie6);
        this.add(Box.createVerticalStrut(10));
        WyborTakNie erasmus = new WyborTakNie();
        this.add(erasmus);

        JLabel polecenie7 = new JLabel("Podaj stopień studenta: ");
        polecenie7.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie7.setBackground(new Color(247, 239, 239));
        this.add(polecenie7);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku stopien = new TekstWyniku();
        this.add(stopien);

        JLabel polecenie8 = new JLabel("Czy student uczy się stacjonarnie? ");
        polecenie8.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie8.setBackground(new Color(247, 239, 239));
        this.add(polecenie8);
        this.add(Box.createVerticalStrut(10));
        WyborTakNie stacjonarnie = new WyborTakNie();
        this.add(stacjonarnie);
        this.add(Box.createVerticalStrut(10));

        JButton dodaj = new JButton("Dodaj studenta");
        dodaj.setBackground(new Color(242, 223, 223));
        dodaj.setForeground(new Color(102, 0, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> Uczelnia.getInstance().add(new Student(imie.getText(), nazwisko.getText(), pesel.getText(), indeks.getText(), Integer.parseInt(rok.getText()), erasmus.wynik(), Integer.parseInt(stopien.getText()), stacjonarnie.wynik())));
        this.add(dodaj);

        this.revalidate();
        this.repaint();

    }

    public void tworzeniPracownika(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj imie pracownika badawczo dydaktycznego: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku imie = new TekstWyniku();
        this.add(imie);
        this.add(Box.createVerticalStrut(10));

        JLabel polecenie2 = new JLabel("Podaj nazwisko pracownika badawczo - dydaktycznego: ");
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie2.setBackground(new Color(247, 239, 239));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku nazwisko = new TekstWyniku();
        this.add(nazwisko);

        JLabel polecenie3 = new JLabel("Podaj numer pesel pracownika badawczo - dydaktycznego: ");
        polecenie3.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie3.setBackground(new Color(247, 239, 239));
        this.add(polecenie3);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku pesel = new TekstWyniku();
        this.add(pesel);

        JLabel polecenie4 = new JLabel("Podaj stanowisko: ");
        polecenie4.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie4.setBackground(new Color(247, 239, 239));
        this.add(polecenie4);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku stanowisko = new TekstWyniku();
        this.add(stanowisko);

        JLabel polecenie5 = new JLabel("Podaj staz pracownika: : ");
        polecenie5.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie5.setBackground(new Color(247, 239, 239));
        this.add(polecenie5);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku staz = new TekstWyniku();
        this.add(staz);

        JLabel polecenie6 = new JLabel("Podaj wynagrodzenie:  ");
        polecenie6.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie6.setBackground(new Color(247, 239, 239));
        this.add(polecenie6);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku wynagrodzenie = new TekstWyniku();
        this.add(wynagrodzenie);

        JLabel polecenie7 = new JLabel("Podaj liczbę publikacji pracownika: ");
        polecenie7.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie7.setBackground(new Color(247, 239, 239));
        this.add(polecenie7);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku publikacje = new TekstWyniku();
        this.add(publikacje);
        this.add(Box.createVerticalStrut(10));

        JButton dodaj = new JButton("Dodaj pracownika");
        dodaj.setBackground(new Color(242, 223, 223));
        dodaj.setForeground(new Color(102, 0, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> Uczelnia.getInstance().add(new PracownikBadawczoDydaktyczny(imie.getText(), nazwisko.getText(), pesel.getText(), stanowisko.getText(), Integer.parseInt(staz.getText()), Double.parseDouble(wynagrodzenie.getText()), Integer.parseInt(publikacje.getText()))));
        this.add(dodaj);


        this.revalidate();
        this.repaint();

    }
}
