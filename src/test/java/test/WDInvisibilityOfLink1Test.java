package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;

import java.io.IOException;

public class WDInvisibilityOfLink1Test extends BaseTest {

    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest() {
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();
    }

    @Test public void InvisibilityOfLink1Test() {
        greenkartChooseCountryPage.openThirdTabDirectly();
        Assert.assertFalse(greenkartChooseCountryPage.invisibilityOfLink1());

    }
}

