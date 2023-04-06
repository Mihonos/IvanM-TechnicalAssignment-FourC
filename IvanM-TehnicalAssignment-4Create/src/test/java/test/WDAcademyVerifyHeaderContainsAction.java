package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartCartPage;
import page.GreenkartChooseCountryPage;

import java.io.IOException;

public class WDAcademyVerifyHeaderContainsAction extends BaseTest {

    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest() throws IOException {
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();
        greenkartChooseCountryPage.openNewTab();
        greenkartChooseCountryPage.scrollToActionsSection();
        greenkartChooseCountryPage.goToThirdTab();

    }

    @Test
    public void WDAcademyVerifyHeaderContainsAction(){
        Assert.assertTrue("Actions",greenkartChooseCountryPage.verifyActionsInTheHeader());
    }



}
