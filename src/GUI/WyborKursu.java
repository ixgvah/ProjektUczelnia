package GUI;

import projekt.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WyborKursu extends JComboBox<Kurs> {
    public WyborKursu(){
        ArrayList<Kurs> kursy = new ArrayList<>();
        for(Kurs o: Kursy.getInstance().getKursy()){
            if(o instanceof Kurs){
                kursy.add(o);
            }
        }
        for(Kurs p: kursy){
            this.addItem(p);
        }

        this.setAlignmentX(Component.LEFT_ALIGNMENT);
        this.setMaximumSize(new Dimension(1000, 30));
        this.setPreferredSize(new Dimension(400, 30));
        this.setBackground(new Color(242, 223, 223));
        this.setForeground(new Color(102, 0, 0));
    }
}
