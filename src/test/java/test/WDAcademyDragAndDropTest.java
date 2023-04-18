package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.GreenkartChooseCountryPage;

import java.io.IOException;

public class WDAcademyDragAndDropTest extends BaseTest {

    GreenkartChooseCountryPage greenkartChooseCountryPage;

    @Before
    public void SetUpTest()  {
        greenkartChooseCountryPage = new GreenkartChooseCountryPage();


    }

    @Test

    public void WDAcademyDragAndDropTest() {
        //greenkartChooseCountryPage.openNewTab();
        //greenkartChooseCountryPage.scrollToActionsSection();
        //greenkartChooseCountryPage.goBackWDHomePage();
        greenkartChooseCountryPage.openThirdTabDirectly();
        greenkartChooseCountryPage.dragAndDrop();
    }

}
