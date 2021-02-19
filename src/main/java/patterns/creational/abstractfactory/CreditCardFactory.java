package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.creditcard.*;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int score) {

        if (score > 650) {
            return new VisaCreditCardFactory();
        } else {
            return new MastercardCreditCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CreditCardType creditCardType);

    public abstract CreditCardValidator getCreditCardValidator();

}
