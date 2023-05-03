package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;
import page.GreenkartHomePage;

import java.io.IOException;

public class WDAcademyActionsTest extends BaseTest {
    GreenkartHomePage greenkartHomePage;
    GreenkartChooseCountryPage greenkartChooseCountryPage;



    @Before
    public void setUpTest() {
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();

    }

    @Test
    public void SecondLinkActionsTest() throws IOException, InterruptedException {
        greenkartChooseCountryPage.openNewTab();
        greenkartChooseCountryPage.scrollToActionsSection();
        greenkartChooseCountryPage.goBackWDHomePage();
    }


}




