package patterns.creational.factory.website;

import patterns.creational.factory.page.AboutPage;
import patterns.creational.factory.page.WelcomePage;

public class GeneralWebsite extends Website {

    @Override
    public void createWebsite() {
        this.pages.add(new WelcomePage());
        this.pages.add(new AboutPage());
    }
}
