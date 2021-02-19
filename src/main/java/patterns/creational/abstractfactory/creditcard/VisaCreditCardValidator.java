package patterns.creational.abstractfactory.creditcard;

public class VisaCreditCardValidator extends CreditCardValidator {

    @Override
    public boolean validate(CreditCard creditCard) {
        return false;
    }
}
