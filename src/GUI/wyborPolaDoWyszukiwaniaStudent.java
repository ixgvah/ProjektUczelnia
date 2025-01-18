package GUI;

import javax.swing.*;

public class wyborPolaDoWyszukiwaniaStudent extends JComboBox<String> {
    public wyborPolaDoWyszukiwaniaStudent(){
        super(new String[]{"imie", "nazwisko", "pesel", "indeks", "rok", "nazwa kursu"});
        this.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
        this.setMaximumSize(new java.awt.Dimension(100, 30));
        this.setPreferredSize(new java.awt.Dimension(100, 30));
        this.setBackground(new java.awt.Color(242, 223, 223));
        this.setForeground(new java.awt.Color(102, 0, 0));
    }

}
