package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyFrame extends JFrame {
    private MenuDodatkowe menuDodatkowe = new MenuDodatkowe(); // Jedna wspólna instancja

    public MyFrame() {
        this.setTitle("System obsługi uczelni");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255, 238, 231));

        try {
            ImageIcon io = new ImageIcon("C:\\Users\\igapo\\OneDrive\\Dokumenty\\PSiO\\GUIdraft\\src\\logo.jpg");
            this.setIconImage(io.getImage());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        this.setLayout(new BorderLayout());

        // Górny panel
        PanelGorny up = new PanelGorny();
        this.add(up, BorderLayout.NORTH);

        // Lewy panel
        MenuGlowne menuGlowne = new MenuGlowne(menuDodatkowe); // Przekazujemy instancję extraMenu
        this.add(menuGlowne, BorderLayout.WEST);

        // Panel centralny
        PanelGlowny mp = new PanelGlowny(menuDodatkowe); // Przekazujemy instancję extraMenu
        this.add(mp, BorderLayout.CENTER);


        this.setVisible(true);
    }
}