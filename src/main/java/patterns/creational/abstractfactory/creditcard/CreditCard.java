package patterns.creational.abstractfactory.creditcard;

public abstract class CreditCard {

    protected String number;

    protected String csc;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCsc() {
        return csc;
    }

    public void setCsc(String csc) {
        this.csc = csc;
    }
}
