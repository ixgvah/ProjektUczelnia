package GUI;

import javax.swing.*;

public class wyborPolaDoWyszukiwaniaPracownik extends JComboBox<String> {
    public wyborPolaDoWyszukiwaniaPracownik(){
        super(new String[]{"imie", "nazwisko", "pesel", "stanowisko", "staż pracy", "liczba nadgodzin", "pensja"});
        this.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
        this.setMaximumSize(new java.awt.Dimension(150, 30));
        this.setPreferredSize(new java.awt.Dimension(150, 30));
        this.setBackground(new java.awt.Color(242, 223, 223));
        this.setForeground(new java.awt.Color(102, 0, 0));
    }
}
