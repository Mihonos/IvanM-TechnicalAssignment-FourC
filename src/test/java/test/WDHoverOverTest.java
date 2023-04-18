package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;

import java.io.IOException;

public class WDHoverOverTest extends BaseTest {
    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void setUpTest(){
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();
    }

    @Test
    public void WDHoverOverTest() throws IOException {
        greenkartChooseCountryPage.openNewTab();
        greenkartChooseCountryPage.scrollToActionsSection();
        Assert.assertTrue(greenkartChooseCountryPage.hoverOverLink1());
    }
}
