package GUI;

import javax.swing.*;
import java.awt.*;

public class PrzyciskMenu extends JButton{
    Runnable action;
    public PrzyciskMenu(String tekst) {
        super(tekst);
        this.setFont(new Font("Serif", Font.BOLD, 15));
        this.setPreferredSize(new Dimension(183, 50));
        this.setMinimumSize(new Dimension(183, 50));
        this.setMaximumSize(new Dimension(183, 50));
        this.setFocusable(false);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setForeground(new Color(102, 0, 0));
        this.setBackground(new Color(242, 223, 223));
    }
    public void setAction(Runnable action) {
        this.addActionListener(e -> action.run());
    }

}
