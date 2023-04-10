package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;
import page.GreenkartHomePage;
import page.GreenkartCartPage;

import static org.junit.Assert.assertFalse;

public class ChooseCountryTest extends BaseTest {
    GreenkartCartPage greenkartCartPage;
    GreenkartHomePage greenkartHomePage;
    GreenkartChooseCountryPage greenkartChooseCountryPage;


    @Before

    public void setUpTest() {
        greenkartHomePage = new GreenkartHomePage();
        greenkartCartPage = new GreenkartCartPage();
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();
        greenkartHomePage.setProductsList();
        greenkartHomePage.setFirstProduct();
        greenkartHomePage.addOneItemFourTimes();
        greenkartHomePage.addThreeRandomItems();
        greenkartHomePage.cartIconClick();
        greenkartHomePage.proceedToCheckoutButtonClick();
        greenkartCartPage.enterPromoCodeFieldSendKeys();
        greenkartCartPage.applyButtonClick();
        greenkartCartPage.placeOrderButtonClick();

    }

    @Test
    public void chooseCountryTest() {
        Assert.assertTrue(greenkartChooseCountryPage.chooseCountryLabelIsDisplayed());
        Assert.assertTrue(greenkartChooseCountryPage.termsAndConditionsLinkIsDisplayed());

    }
}


