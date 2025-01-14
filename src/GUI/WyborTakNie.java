package GUI;

import javax.swing.*;
import java.awt.*;

public class WyborTakNie extends JComboBox<String> {
    public WyborTakNie(){
        super(new String[]{"Tak", "Nie"});
        this.setAlignmentX(Component.LEFT_ALIGNMENT);
        this.setMaximumSize(new Dimension(100, 30));
        this.setPreferredSize(new Dimension(100, 30));
        this.setBackground(new Color(242, 223, 223));
        this.setForeground(new Color(102, 0, 0));
    }

    public boolean wynik() {
        if(this.getSelectedItem()=="Tak"){
            return true;
        }
        else{
            return false;
        }
    }
}
