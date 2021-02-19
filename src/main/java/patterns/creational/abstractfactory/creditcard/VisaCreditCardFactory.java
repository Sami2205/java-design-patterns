package patterns.creational.abstractfactory.creditcard;

import patterns.creational.abstractfactory.CreditCardFactory;

public class VisaCreditCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CreditCardType creditCardType) {

        switch (creditCardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public CreditCardValidator getCreditCardValidator() {
        return new VisaCreditCardValidator();
    }
}
