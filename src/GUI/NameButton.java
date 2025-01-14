package GUI;

import javax.swing.*;
import java.awt.*;

public class NameButton extends JButton {
    Runnable action;
    public NameButton(String tekst) {
        super(tekst);
        this.setFont(new Font("Serif", Font.BOLD, 15));
        this.setPreferredSize(new Dimension(300, 40));
        this.setMaximumSize(new Dimension(300, 40));
        this.setFocusable(false);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setForeground(new Color(102, 0, 0));
        this.setBackground(new Color(242, 223, 223));
    }
    public void setAction(Runnable action) {
        this.addActionListener(e -> action.run());
    }
}
