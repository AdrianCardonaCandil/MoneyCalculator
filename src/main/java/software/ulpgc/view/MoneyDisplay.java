package software.ulpgc.view;
import software.ulpgc.model.Money;

/*
"Represents an interface for displaying a certain amount of money.
It has a single method called 'display' for this purpose."
* */

public interface MoneyDisplay {
    public abstract void display(Money money);
}
