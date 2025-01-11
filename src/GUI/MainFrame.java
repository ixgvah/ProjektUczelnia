package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ExtraMenu extraMenu = new ExtraMenu(); // Jedna wspólna instancja

    public MainFrame() {
        this.setTitle("System obsługi uczelni");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255, 238, 231));

        ImageIcon io = new ImageIcon("C:\\Users\\igapo\\OneDrive\\Dokumenty\\PSiO\\GUIdraft\\src\\logo.jpg");
        this.setIconImage(io.getImage());
        this.setLayout(new BorderLayout());

        // Górny panel
        UpperPanel up = new UpperPanel();
        this.add(up, BorderLayout.NORTH);

        // Lewy panel
        MenuLeftPanel menuLeftPanel = new MenuLeftPanel(extraMenu); // Przekazujemy instancję extraMenu
        this.add(menuLeftPanel, BorderLayout.WEST);

        // Panel centralny
        MainPanel mp = new MainPanel(extraMenu); // Przekazujemy instancję extraMenu
        this.add(mp, BorderLayout.CENTER);

        this.setVisible(true);
    }
}