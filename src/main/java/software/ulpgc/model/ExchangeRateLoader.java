package software.ulpgc.model;

public interface ExchangeRateLoader {
    public abstract ExchangeRate loadExchangeRate(Currency base, Currency quote);
}
