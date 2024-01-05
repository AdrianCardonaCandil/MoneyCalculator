package software.ulpgc.view.swing;

import software.ulpgc.model.Currency;
import software.ulpgc.model.Money;
import software.ulpgc.view.MoneyDialog;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class SwingMoneyDialog extends JPanel implements MoneyDialog {

    private final JTextField textField = new JTextField();
    private final JLabel textLabel = new JLabel("Select now the target currency");
    private final SwingCurrencyDialog currencyDialog;

    public SwingMoneyDialog(SwingCurrencyDialog dialog) {
        this.currencyDialog = dialog;
        this.initSetup();
        this.setVisible(true);
    }

    public void initSetup(){
        this.setLayout(null);
        this.setBackground(Color.darkGray);
        this.textLabel.setForeground(Color.white);
        this.add(currencyDialog);
        this.add(textLabel);
        this.add(textField);
    }

    public JTextField getTextField() {
        return textField;
    }

    public SwingCurrencyDialog getCurrencyDialog() {
        return currencyDialog;
    }

    public JLabel getTextLabel() {
        return textLabel;
    }

    @Override
    public void setCurrencies(Set<Currency> currencies) {
        this.currencyDialog.setCurrencies(currencies);
    }

    @Override
    public Money get() {
        return new Money(this.currencyDialog.get(), Double.parseDouble(this.textField.getText()));
    }

}
