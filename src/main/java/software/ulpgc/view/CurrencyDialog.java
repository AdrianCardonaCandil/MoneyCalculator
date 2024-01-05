package software.ulpgc.view;
import software.ulpgc.model.Currency;
import java.util.Set;

/*
Represents a display and selection interface for a set of currencies.
The 'setCurrencies' method defines the currencies to be displayed. The
'get' method is used to select one of them.
* */

public interface CurrencyDialog {
    public abstract void setCurrencies(Set<Currency> currencies);
    public abstract Currency get();
}
