package GUI;

import projekt.Osoba;
import projekt.PracownikBadawczoDydaktyczny;
import projekt.Student;
import projekt.Uczelnia;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WyborStudenta extends JComboBox<Student> {
    public WyborStudenta(){
        ArrayList<Student> wykladowcy = new ArrayList<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof Student){
                wykladowcy.add((Student) o);
            }
        }
        for(Student p: wykladowcy){
            this.addItem(p);
        }

        this.setAlignmentX(Component.LEFT_ALIGNMENT);
        this.setMaximumSize(new Dimension(1000, 30));
        this.setPreferredSize(new Dimension(400, 30));
        this.setBackground(new Color(242, 223, 223));
        this.setForeground(new Color(102, 0, 0));
    }
}
