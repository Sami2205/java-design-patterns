package patterns.creational.abstractfactory.creditcard;

public class MastercardCreditCardValidator extends CreditCardValidator {

    @Override
    public boolean validate(CreditCard creditCard) {
        return false;
    }
}
