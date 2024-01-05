package software.ulpgc.view;
import software.ulpgc.model.Currency;
import software.ulpgc.model.Money;
import java.util.Set;

/*
Represents a display and selection interface for an amount
of money. Therefore, it provides a method ('setCurrencies')
to define the currencies to be selected. Additionally, it
offers another method ('get') to select a specific currency
with the corresponding amount (Money Object).
* */

public interface MoneyDialog {
    public abstract void setCurrencies(Set<Currency> currencies);
    public abstract Money get();
}
