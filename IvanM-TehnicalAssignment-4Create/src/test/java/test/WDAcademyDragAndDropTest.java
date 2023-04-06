package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;

import java.io.IOException;

public class WDAcademyDragAndDropTest extends BaseTest {

    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest() throws IOException {
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();
        greenkartChooseCountryPage.openNewTab();
        greenkartChooseCountryPage.scrollToActionsSection();
        greenkartChooseCountryPage.goToThirdTab();

    }

    @Test
    public void WDAcademyDragAndDropTest(){
        greenkartChooseCountryPage.dragAndDrop();
    }

}
