package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.creditcard.CreditCard;
import patterns.creational.abstractfactory.creditcard.CreditCardType;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(800);

        CreditCard creditCard = abstractFactory.getCreditCard(CreditCardType.GOLD);

        System.out.println(creditCard);

        abstractFactory = CreditCardFactory.getCreditCardFactory(250);

        creditCard = abstractFactory.getCreditCard(CreditCardType.GOLD);

        System.out.println(creditCard);

    }
}
