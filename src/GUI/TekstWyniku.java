package GUI;

import javax.swing.*;
import java.awt.*;

public class TekstWyniku extends JTextField {
    public TekstWyniku(){
        this.setAlignmentX(Component.LEFT_ALIGNMENT);
        this.setPreferredSize(new Dimension(300, 20));
        this.setMaximumSize(new Dimension(300, 30));
    }
}
