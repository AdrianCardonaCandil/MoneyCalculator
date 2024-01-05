package software.ulpgc.view.swing;
import javax.swing.*;
import java.awt.*;

public class SwingMainFrame extends JFrame {

    private final OperationalPanel operationalPanel = new OperationalPanel();
    private final DisplayPanel displayPanel = new DisplayPanel();

    public static void main(String[] args) {
        SwingMainFrame mainFrame = new SwingMainFrame();
        mainFrame.setVisible(true);
    }

    public SwingMainFrame() throws HeadlessException {
        this.initSetup();
        this.addAndSetupComponents();
    }

    private void setupSubPanels() {
        this.operationalPanel.addAndSetupComponents();
        this.displayPanel.addAndSetupComponents();
    }

    private void addAndSetupComponents() {
        this.add(operationalPanel);
        this.add(displayPanel);
        this.setupSubPanels();
    }

    private void initSetup() {
        this.setTitle("Currency Exchange");
        this.setSize(700, 730);
        this.getContentPane().setSize(700, 730);
        this.setLayout(new GridLayout(2, 1));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
