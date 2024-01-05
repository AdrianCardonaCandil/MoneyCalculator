package software.ulpgc.view.swing;

import software.ulpgc.model.Currency;
import software.ulpgc.view.CurrencyDialog;

import javax.swing.*;
import java.util.Set;

public class SwingCurrencyDialog  extends JComboBox<Currency> implements CurrencyDialog {

    @Override
    public void setCurrencies(Set<Currency> currencies) {
        for (Currency currency : currencies){
            this.addItem(currency);
        }
    }

    @Override
    public Currency get() {
        return this.getItemAt(this.getSelectedIndex());
    }
}
