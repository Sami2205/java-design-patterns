package patterns.creational.factory;

import patterns.creational.factory.website.*;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType websiteType) {
        switch (websiteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return new GeneralWebsite();
        }
    }

}
