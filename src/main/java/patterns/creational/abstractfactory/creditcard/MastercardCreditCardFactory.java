package patterns.creational.abstractfactory.creditcard;

import patterns.creational.abstractfactory.CreditCardFactory;

public class MastercardCreditCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CreditCardType creditCardType) {

        switch (creditCardType) {
            case GOLD:
                return new MastercardGoldCreditCard();
            case PLATINUM:
                return new MastercardPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public CreditCardValidator getCreditCardValidator() {
        return new MastercardCreditCardValidator();
    }
}
