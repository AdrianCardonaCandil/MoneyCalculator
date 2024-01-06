package software.ulpgc.view.swing;

import javax.swing.*;
import java.awt.*;


public class OperationalPanel extends JPanel {

    private final ImagePanel imagePanel = new ImagePanel();
    private final ControlPanel controlPanel = new ControlPanel();

    public OperationalPanel() {
        this.initSetup();
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void addAndSetupComponents() {
        this.setSize(this.getParent().getWidth(), this.getParent().getHeight() / 2);
        this.add(imagePanel);
        this.add(controlPanel);
        this.setupControlPanel();
    }

    private void setupControlPanel() {
        this.controlPanel.addAndSetupComponents();
    }

    private void initSetup() {
        this.setLayout(new GridLayout(1, 2));
    }
}