package GUI;

import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {
    ResultPanel resultPanel = ResultPanel.getInstance(); // Tworzymy instancję ResultPanel
    public MainPanel(ExtraMenu extraMenu) { // Pobiera instancję extraMenu
        setLayout(new BorderLayout());
        this.setBackground(new Color(236, 231, 231));
        this.add(extraMenu, BorderLayout.NORTH); // Dodajemy extraMenu na górze
        this.add(resultPanel, BorderLayout.CENTER); // Dodajemy ResultPanel na środku

    }
}

