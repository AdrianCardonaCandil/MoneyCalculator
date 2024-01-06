package software.ulpgc.controller;
import software.ulpgc.model.*;
import software.ulpgc.view.swing.*;

public class ExchangeCommand implements Command{

    private final SwingCurrencyDialog swingCurrencyDialog;
    private final SwingMoneyDialog swingMoneyDialog;
    private final ExchangeRateLoader exchangeRateLoader;
    private final SwingMoneyDisplay swingMoneyDisplay;

    public ExchangeCommand(SwingMoneyDialog swingMoneyDialog, SwingCurrencyDialog swingCurrencyDialog,
                           ExchangeRateLoader exchangeRateLoader, SwingMoneyDisplay swingMoneyDisplay) {
        this.swingCurrencyDialog = swingCurrencyDialog;
        this.swingMoneyDialog = swingMoneyDialog;
        this.exchangeRateLoader = exchangeRateLoader;
        this.swingMoneyDisplay = swingMoneyDisplay;
    }

    @Override
    public void execute() {
        this.swingMoneyDisplay.setText(null);
        ExchangeRate exchangeRate = exchangeRateLoader.loadExchangeRate(swingMoneyDialog.get().currency(),
                swingCurrencyDialog.get());
        this.swingMoneyDisplay.display(new Money(swingCurrencyDialog.get(), swingMoneyDialog.get().amount() *
                exchangeRate.rate()));
    }
}
