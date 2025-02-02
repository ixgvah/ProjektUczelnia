package GUI;

import javax.swing.*;
import java.awt.*;

class PanelGlowny extends JPanel {
    PanelWyniki panelWyniki = PanelWyniki.getInstance();
    public PanelGlowny(MenuDodatkowe menuDodatkowe) {
        setLayout(new BorderLayout());
        this.setBackground(new Color(236, 231, 231));
        this.add(menuDodatkowe, BorderLayout.NORTH);
        this.add(panelWyniki, BorderLayout.CENTER);

    }
}

