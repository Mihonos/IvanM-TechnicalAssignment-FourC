package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;

import java.io.IOException;

public class WDAcademyAAVerifyHeaderContainsAction extends BaseTest {

    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest()  {
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();


    }

    @Test
    public void WDAcademyVerifyHeaderContainsAction() throws IOException, InterruptedException {
        greenkartChooseCountryPage.openNewTab();
        greenkartChooseCountryPage.scrollToActionsSection();
        Assert.assertTrue(greenkartChooseCountryPage.goBackWDHomePage());
    }

}
