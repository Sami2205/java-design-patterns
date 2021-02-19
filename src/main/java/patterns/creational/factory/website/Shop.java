package patterns.creational.factory.website;

import patterns.creational.factory.page.AboutPage;
import patterns.creational.factory.page.CartPage;
import patterns.creational.factory.page.ItemPage;
import patterns.creational.factory.page.WelcomePage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        this.pages.add(new WelcomePage());
        this.pages.add(new AboutPage());
        this.pages.add(new ItemPage());
        this.pages.add(new CartPage());
    }
}
