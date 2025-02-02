package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelGorny extends JPanel {
    public PanelGorny() {
        this.setLayout(new BorderLayout());
        try{
            ImageIcon img = new ImageIcon("C:\\Users\\igapo\\OneDrive\\Dokumenty\\PSiO\\GUIdraft\\src\\GUI\\logotyp.png");
            Image si = img.getImage().getScaledInstance(75, 90, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(si));
            imageLabel.setBorder(new EmptyBorder(0, 20, 0, 0));
            this.add(imageLabel, BorderLayout.WEST);
            this.setBackground(new Color(255, 204, 204));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        this.setPreferredSize(new Dimension(100, 100));
        JLabel titleLabel = new JLabel();
        titleLabel.setText("Projekt uczelnia");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 30));
        titleLabel.setForeground(new Color(153, 0, 0));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titleLabel, BorderLayout.CENTER);

    }
}
