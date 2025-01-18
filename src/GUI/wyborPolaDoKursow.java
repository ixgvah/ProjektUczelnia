package GUI;

import javax.swing.*;

public class wyborPolaDoKursow extends JComboBox<String> {
    public wyborPolaDoKursow(){
        super(new String[]{"nazwa", "ECTS", "nazwisko prowadzącego"});
        this.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
        this.setMaximumSize(new java.awt.Dimension(150, 30));
        this.setPreferredSize(new java.awt.Dimension(150, 30));
        this.setBackground(new java.awt.Color(242, 223, 223));
        this.setForeground(new java.awt.Color(102, 0, 0));
    }
}
