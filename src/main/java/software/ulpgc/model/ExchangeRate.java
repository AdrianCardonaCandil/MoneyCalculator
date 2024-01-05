package software.ulpgc.model;
import java.time.LocalDate;

/*
Class representing an exchange rate. The class has a base currency (the source currency
of the exchange rate) and a quoted currency (the destination currency of the exchange rate).
It has a field with the rate set for that combination on a specific date.
* */

public record ExchangeRate (Currency base, Currency quote, LocalDate date, double rate){
}
