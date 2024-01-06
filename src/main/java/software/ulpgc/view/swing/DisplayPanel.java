package software.ulpgc.view.swing;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private final SwingMoneyDisplay display = new SwingMoneyDisplay();
    private final JButton button = new JButton("Apply Currency Change");
    public DisplayPanel() {
        this.initSetup();
    }

    private void initSetup() {
        this.setLayout(null);
        this.setBackground(Color.getHSBColor(245, 245, 220));
    }

    public SwingMoneyDisplay getDisplay() {
        return display;
    }

    public JButton getButton() {
        return button;
    }

    public void addAndSetupComponents() {
        this.setSize(this.getParent().getWidth(), this.getParent().getHeight() / 2);
        this.add(button);
        this.add(display);
        this.setComponentBounds();
    }

    private void setComponentBounds() {
        this.display.setBounds(5, 5, this.getWidth() - 10, this.getHeight() - 75);
        this.button.setBounds((this.getWidth() / 2) - 100, this.getHeight() - 68, 200, 50);
    }
}
