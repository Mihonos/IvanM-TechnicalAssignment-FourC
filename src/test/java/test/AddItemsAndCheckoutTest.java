package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartHomePage;

public class AddItemsAndCheckoutTest extends BaseTest {
    GreenkartHomePage greenkartHomePage;

    @Before

    public void setUpTest() {
        greenkartHomePage = new GreenkartHomePage();
        greenkartHomePage.setProductsList();
        greenkartHomePage.setFirstProduct();
    }

    @Test

    public void greenkartHomePageTest() {
        greenkartHomePage.addOneItemFourTimes();
        Assert.assertTrue(greenkartHomePage.isOneItemAddedCorrectly());
        System.out.println("One item is added to basket four times");
        greenkartHomePage.addThreeRandomItems();
        Assert.assertTrue(greenkartHomePage.areRandomItemsAddedCorrectly());
        System.out.println("Three random items are added to basket");
        greenkartHomePage.cartIconClick();
        greenkartHomePage.proceedToCheckoutButtonClick();
    }

}
