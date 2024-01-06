package software.ulpgc.model;
/*
Class representing a certain amount of money. The class has a currency and a 'amount'
field that represents the quantity of that currency.
 */
public record Money (Currency currency, double amount){
    @Override
    public String toString(){
        // Remember, this.currency will launch toString method.
        return String.format("%.8f", amount) + ":" + this.currency;
    }
}
