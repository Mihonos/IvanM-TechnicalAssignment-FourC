package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartCartPage;
import page.GreenkartChooseCountryPage;
import page.GreenkartHomePage;

public class SelectCountryDropDownTest extends BaseTest {

    GreenkartCartPage greenkartCartPage;
    GreenkartHomePage greenkartHomePage;
    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest() {

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
        greenkartChooseCountryPage.selectRandomCountry();
    }

    @Test
    public void SelectCountryDropDownTest() {
        Assert.assertFalse(greenkartChooseCountryPage.selectBtnIsEnabled());
        Assert.assertTrue(greenkartChooseCountryPage.termsAndConditionsLinkIsDisplayed());
    }

}




