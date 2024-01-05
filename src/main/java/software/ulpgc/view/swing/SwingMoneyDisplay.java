package software.ulpgc.view.swing;

import software.ulpgc.model.Money;
import software.ulpgc.view.MoneyDisplay;
import javax.swing.*;
import java.awt.*;

public class SwingMoneyDisplay extends JTextField implements MoneyDisplay {

    public SwingMoneyDisplay() {
        this.setHorizontalAlignment(CENTER);
        this.setEnabled(true);
        this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), 30));
    }

    @Override
    public void display(Money money) {
        this.setText(money.toString());
    }
}
