package GUI;

import Serializacja.SerializacjaKursow;
import Serializacja.SerializacjaOsob;
import projekt.*;
import deserializacja.deserializacjaKursow;
import deserializacja.deserializacjaOsob;

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

    public void wyswietlOsoby(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            JLabel osoba = new JLabel(o.toString());
            osoba.setBackground(new Color(247, 239, 239));
            osoba.setPreferredSize(new Dimension(100, 20));
            osoba.setAlignmentX(Component.LEFT_ALIGNMENT);
            osoba.setFont(new Font("Serif", Font.BOLD, 15));
            this.add(osoba);
            this.add(Box.createVerticalStrut(10));
        }
        this.revalidate();
        this.repaint();
    }

    public void wyswietlStudentow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof Student){
                JLabel osoba = new JLabel(o.toString());
                osoba.setBackground(new Color(247, 239, 239));
                osoba.setPreferredSize(new Dimension(100, 20));
                osoba.setAlignmentX(Component.LEFT_ALIGNMENT);
                osoba.setFont(new Font("Serif", Font.BOLD, 15));
                this.add(osoba);
                this.add(Box.createVerticalStrut(10));
            }
        }
        this.revalidate();
        this.repaint();
    }

    public  void wyswietlPracownikow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof PracownikUczelni){
                JLabel osoba = new JLabel(o.toString());
                osoba.setBackground(new Color(247, 239, 239));
                osoba.setPreferredSize(new Dimension(100, 20));
                osoba.setAlignmentX(Component.LEFT_ALIGNMENT);
                osoba.setFont(new Font("Serif", Font.BOLD, 15));
                this.add(osoba);
                this.add(Box.createVerticalStrut(10));
            }
        }
        this.revalidate();
        this.repaint();
    }

    public void wyswietlKursy(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        for(Kurs k: Kursy.getInstance().getKursy()){
            JLabel kurs = new JLabel(k.toString());
            kurs.setBackground(new Color(247, 239, 239));
            kurs.setPreferredSize(new Dimension(100, 20));
            kurs.setAlignmentX(Component.LEFT_ALIGNMENT);
            kurs.setFont(new Font("Serif", Font.BOLD, 15));
            this.add(kurs);
            this.add(Box.createVerticalStrut(10));
        }
        this.revalidate();
        this.repaint();
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
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Dodaj studenta");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
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
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Dodaj pracownika");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> Uczelnia.getInstance().add(new PracownikBadawczoDydaktyczny(imie.getText(), nazwisko.getText(), pesel.getText(), stanowisko.getText(), Integer.parseInt(staz.getText()), Double.parseDouble(wynagrodzenie.getText()), Integer.parseInt(publikacje.getText()))));
        this.add(dodaj);


        this.revalidate();
        this.repaint();

    }
    public void tworzeniePracownikaAdministracyjnego(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj imie pracownika administracyjnego: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku imie = new TekstWyniku();
        this.add(imie);
        this.add(Box.createVerticalStrut(10));

        JLabel polecenie2 = new JLabel("Podaj nazwisko pracownika administracyjnego: ");
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie2.setBackground(new Color(247, 239, 239));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku nazwisko = new TekstWyniku();
        this.add(nazwisko);

        JLabel polecenie3 = new JLabel("Podaj numer pesel pracownika administracyjnego: ");
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

        JLabel polecenie7 = new JLabel("Podaj liczbę nadgodzin pracownika: ");
        polecenie7.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie7.setBackground(new Color(247, 239, 239));
        this.add(polecenie7);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku publikacje = new TekstWyniku();
        this.add(publikacje);
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Dodaj pracownika");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> Uczelnia.getInstance().add(new PracownikAdministracyjny(imie.getText(), nazwisko.getText(), pesel.getText(), stanowisko.getText(), Integer.parseInt(staz.getText()), Double.parseDouble(wynagrodzenie.getText()), Integer.parseInt(publikacje.getText()))));
        this.add(dodaj);


        this.revalidate();
        this.repaint();

    }

    public void tworzenieKursu(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj nazwę kursu: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku nazwa = new TekstWyniku();
        this.add(nazwa);
        this.add(Box.createVerticalStrut(10));

        JLabel polecenie2 = new JLabel("Wybierz wykladowce: ");
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie2.setBackground(new Color(247, 239, 239));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        WyborWykladowcy ww = new WyborWykladowcy();
        this.add(ww);
        this.add(Box.createVerticalStrut(10));
        PracownikBadawczoDydaktyczny w = (PracownikBadawczoDydaktyczny) ww.getSelectedItem();

        JLabel polecenie3 = new JLabel("Podaj liczbę punktów ECTS: ");
        polecenie3.setFont(new Font("Serif", Font.BOLD, 15));
        polecenie3.setBackground(new Color(247, 239, 239));
        this.add(polecenie3);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku ECTS = new TekstWyniku();
        this.add(ECTS);
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Dodaj kurs");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> Kursy.getInstance().dodajKurs(new Kurs(nazwa.getText(), w, Integer.parseInt(ECTS.getText()))));
        this.add(dodaj);


        this.revalidate();
        this.repaint();

    }

    public void wyszukiwanieStudentow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj pole, po którym chcesz wyszukać: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        wyborPolaDoWyszukiwaniaStudent pole = new wyborPolaDoWyszukiwaniaStudent();
        this.add(pole);
        this.add(Box.createVerticalStrut(10));
        JLabel polecenie2 = new JLabel("Podaj wartość wybranego pola: ");
        polecenie2.setBackground(new Color(247, 239, 239));
        polecenie2.setPreferredSize(new Dimension(100, 20));
        polecenie2.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku wartosc = new TekstWyniku();
        this.add(wartosc);
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Wyszukaj");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> {
            for(Student s: Uczelnia.getInstance().wyszukajStudenta((String) pole.getSelectedItem(), wartosc.getText())){
                JLabel student = new JLabel(s.toString());
                student.setBackground(new Color(247, 239, 239));
                student.setPreferredSize(new Dimension(100, 20));
                student.setAlignmentX(Component.LEFT_ALIGNMENT);
                student.setFont(new Font("Serif", Font.BOLD, 15));
                this.add(student);
                this.add(Box.createVerticalStrut(10));
                this.revalidate();
                this.repaint();
            }
        });
        this.add(dodaj);
        this.add(Box.createVerticalStrut(50));

        this.revalidate();
        this.repaint();

    }

    public void wyszukiwaniePracownikow() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj pole, po którym chcesz wyszukać: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        wyborPolaDoWyszukiwaniaPracownik pole = new wyborPolaDoWyszukiwaniaPracownik();
        this.add(pole);
        this.add(Box.createVerticalStrut(10));
        JLabel polecenie2 = new JLabel("Podaj wartość wybranego pola: ");
        polecenie2.setBackground(new Color(247, 239, 239));
        polecenie2.setPreferredSize(new Dimension(100, 20));
        polecenie2.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku wartosc = new TekstWyniku();
        this.add(wartosc);
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Wyszukaj");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> {
            for (PracownikUczelni p : Uczelnia.getInstance().wyszukajPracownika((String) pole.getSelectedItem(), wartosc.getText())) {
                JLabel pracownik = new JLabel(p.toString());
                pracownik.setBackground(new Color(247, 239, 239));
                pracownik.setPreferredSize(new Dimension(100, 20));
                pracownik.setAlignmentX(Component.LEFT_ALIGNMENT);
                pracownik.setFont(new Font("Serif", Font.BOLD, 15));
                this.add(pracownik);
                this.add(Box.createVerticalStrut(10));
                this.revalidate();
                this.repaint();
            }
        });
        this.add(dodaj);
        this.add(Box.createVerticalStrut(50));

        this.revalidate();
        this.repaint();
    }
    public void wyszukiwanieKursow(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(236, 231, 231));
        JLabel polecenie = new JLabel("Podaj pole, po którym chcesz wyszukać: ");
        polecenie.setBackground(new Color(247, 239, 239));
        polecenie.setPreferredSize(new Dimension(100, 20));
        polecenie.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie);
        this.add(Box.createVerticalStrut(10));
        wyborPolaDoKursow pole = new wyborPolaDoKursow();
        this.add(pole);
        this.add(Box.createVerticalStrut(10));
        JLabel polecenie2 = new JLabel("Podaj wartość wybranego pola: ");
        polecenie2.setBackground(new Color(247, 239, 239));
        polecenie2.setPreferredSize(new Dimension(100, 20));
        polecenie2.setAlignmentX(Component.LEFT_ALIGNMENT);
        polecenie2.setFont(new Font("Serif", Font.BOLD, 15));
        this.add(polecenie2);
        this.add(Box.createVerticalStrut(10));
        TekstWyniku wartosc = new TekstWyniku();
        this.add(wartosc);
        this.add(Box.createVerticalStrut(50));

        JButton dodaj = new JButton("Wyszukaj");
        dodaj.setBackground(new Color(204, 255, 204));
        dodaj.setForeground(new Color(0, 153, 0));
        dodaj.setFocusable(false);
        dodaj.setAlignmentX(Component.LEFT_ALIGNMENT);
        dodaj.addActionListener(e -> {
            for(Kurs k: Kursy.getInstance().wyszukajKursy((String) pole.getSelectedItem(), wartosc.getText())){
                JLabel kurs = new JLabel(k.toString());
                kurs.setBackground(new Color(247, 239, 239));
                kurs.setPreferredSize(new Dimension(100, 20));
                kurs.setAlignmentX(Component.LEFT_ALIGNMENT);
                kurs.setFont(new Font("Serif", Font.BOLD, 15));
                ResultPanel.getInstance().add(kurs);
                ResultPanel.getInstance().add(Box.createVerticalStrut(10));
                this.revalidate();
                this.repaint();
            }
        });
        this.add(dodaj);
        this.add(Box.createVerticalStrut(50));

        this.revalidate();
        this.repaint();
    }
    public void zapiszOsoby(){
        this.removeAll();

        SerializacjaOsob so = new SerializacjaOsob();
        so.wykonajSerializacje();
        JLabel wynik = new JLabel("Pomyślnie zapisano osoby");
        wynik.setBackground(new Color(247, 239, 239));
        wynik.setPreferredSize(new Dimension(100, 20));
        wynik.setAlignmentX(Component.CENTER_ALIGNMENT);
        wynik.setFont(new Font("Serif", Font.BOLD, 30));

        this.add(Box.createVerticalGlue()); // Wyrównanie na osi Y
        this.add(Box.createHorizontalGlue()); // Wyrównanie na osi X
        this.add(wynik);
        this.add(Box.createVerticalGlue()); // Wyrównanie na osi Y
        this.add(Box.createHorizontalGlue()); // Wyrównanie na osi X
        this.revalidate();
        this.repaint();
    }

    public void zapiszKursy(){
        this.removeAll();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        SerializacjaKursow sk = new SerializacjaKursow();
        sk.wykonajSerializacje();

        JLabel wynik = new JLabel("Pomyślnie zapisano kursy");
        wynik.setBackground(new Color(247, 239, 239));
        wynik.setPreferredSize(new Dimension(100, 20));
        wynik.setAlignmentX(Component.CENTER_ALIGNMENT);
        wynik.setFont(new Font("Serif", Font.BOLD, 30));

        this.add(Box.createVerticalGlue()); // Wyrównanie na osi Y
        this.add(Box.createHorizontalGlue()); // Wyrównanie na osi X
        this.add(wynik);
        this.add(Box.createVerticalGlue()); // Wyrównanie na osi Y
        this.add(Box.createHorizontalGlue()); // Wyrównanie na osi X
        this.revalidate();
        this.repaint();
    }
}


