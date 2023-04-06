package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartCartPage;
import page.GreenkartChooseCountryPage;
import page.GreenkartHomePage;

public class SuccessfulOrderMessageTest extends BaseTest {

    GreenkartCartPage greenkartCartPage;
    GreenkartHomePage greenkartHomePage;
    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest(){
        greenkartCartPage = new GreenkartCartPage();
        greenkartHomePage = new GreenkartHomePage();
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
        greenkartChooseCountryPage.acceptTermsAndConditions();
        greenkartChooseCountryPage.clickProceed();

    }
    @Test
    public void SuccessfulOrderMessageTest() {
        Assert.assertTrue(greenkartChooseCountryPage.successfullyPlacedOrderMessageIsDisplayed());
    }

}
