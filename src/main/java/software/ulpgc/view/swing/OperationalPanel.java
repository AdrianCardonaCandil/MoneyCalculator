package software.ulpgc.view.swing;

import software.ulpgc.model.*;
import javax.swing.*;
import java.awt.*;
import java.util.Set;


public class OperationalPanel extends JPanel {

    private final ImagePanel imagePanel = new ImagePanel();
    private final ControlPanel controlPanel = new ControlPanel();

    public OperationalPanel() {
        this.initSetup();
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

class ImagePanel extends JPanel {

    JLabel imageLabel;

    public ImagePanel() {
        ImageIcon image = new ImageIcon("exchange-rate.jpeg");
        imageLabel = new JLabel(image);
        this.add(imageLabel);
    }
}

class ControlPanel extends JPanel {

    private final Set<Currency> currencies = new FixerAPICurrencyLoader().loadCurrencies();
    private final SwingCurrencyDialog baseCurrencyDialog = new SwingCurrencyDialog();
    private final SwingMoneyDialog moneyDialog = new SwingMoneyDialog(new SwingCurrencyDialog());
    private final JLabel label = new JLabel("Please, select the source currency");

    public ControlPanel() {
        this.initSetup();
        this.loadComponents();
    }

    public void addAndSetupComponents() {
        this.setSize(this.getParent().getWidth() / 2, this.getParent().getHeight());
        this.add(baseCurrencyDialog);
        this.add(moneyDialog);
        this.add(label);
        this.setComponentsBounds();
    }

    private void setComponentsBounds() {
        this.label.setBounds(65, 55, 250, 20);
        this.baseCurrencyDialog.setBounds(20, 80, 300, 20);
        this.moneyDialog.setBounds(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        this.moneyDialog.getTextLabel().setBounds(70, 45, 250, 20);
        this.moneyDialog.getCurrencyDialog().setBounds(20, 70, 220, 20);
        this.moneyDialog.getTextField().setBounds(240, 70, 80, 20);
    }

    public void loadComponents() {
        this.baseCurrencyDialog.setCurrencies(currencies);
        this.moneyDialog.setCurrencies(currencies);
    }

    private void initSetup() {
        this.setLayout(null);
        this.setBackground(Color.darkGray);
        this.label.setForeground(Color.white);
    }
}