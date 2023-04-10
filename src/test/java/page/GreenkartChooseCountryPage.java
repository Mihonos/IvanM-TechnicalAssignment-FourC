package page;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GreenkartChooseCountryPage extends BaseTest {

    public GreenkartChooseCountryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div/label[text()='Choose Country']")
    WebElement chooseCountryLabel;
    @FindBy(linkText = "Terms & Conditions")
    WebElement termsAndConditionsLink;
    @FindBy(css = "option[disabled]")
    WebElement selectBtn;
    @FindBy(xpath = "//div/input")
    WebElement checkBox;
    @FindBy(xpath = "//button")
    WebElement proceedBtn;
    @FindBy(css = "span[style]")
    WebElement successfulOrderMessage;
    @FindBy(xpath = "(//div[@class='section-title'])[9]")
    WebElement actionsTitle;
    @FindBy(id = "nav-title")
    WebElement mainHeader;
    @FindBy(xpath = "//div[@class=('col-lg-6 text-center')]/div[1]/div[1]/p/b")
    WebElement dragElement;
    @FindBy(xpath = "//div[@class=('ui-widget-header ui-droppable')]/p/b")
    WebElement droppableElement;
    @FindBy(xpath = "//div[@class=('col-lg-12 text-center')]/div[1]/div[1]/div/a")
    WebElement link1;



    //public void defineCountriesList(){
    //countriesList = driver.findElements(By.cssSelector("option[value]"));
    //}

    public boolean chooseCountryLabelIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(chooseCountryLabel));
        return chooseCountryLabel.isDisplayed();
    }

    public boolean termsAndConditionsLinkIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(termsAndConditionsLink));
        return termsAndConditionsLink.isDisplayed();
    }

    //public void clickChooseCountry(){
    //countryField.click();
    //}
    public boolean selectBtnIsEnabled() {
        wdWait.until(ExpectedConditions.visibilityOf(selectBtn));
        return selectBtn.isEnabled();
    }


    public void selectRandomCountry() {
        WebElement countriesList = driver.findElement(By.cssSelector("select[style]"));
        Select select = new Select(countriesList);
        List<WebElement> selections = select.getOptions();
        int index = (int) (Math.random() * selections.size());
        select.selectByIndex(index);

    }

    public void acceptTermsAndConditions() {
        wdWait.until(ExpectedConditions.visibilityOf(checkBox));
        checkBox.click();
    }

    public void clickProceed() {
        wdWait.until(ExpectedConditions.visibilityOf(proceedBtn));
        proceedBtn.click();
    }

    public boolean successfullyPlacedOrderMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulOrderMessage));
        return successfulOrderMessage.isDisplayed();
    }

    public void openNewTab() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://www.webdriveruniversity.com/");

    }

    public void scrollToActionsSection() throws IOException {
        Actions actions = new Actions(driver);
        actions.moveToElement(actionsTitle);
        actions.perform();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src/screenshots.png"));
        actionsTitle.click();
    }

    //public  void clickActionsBtn(){actionsTitle.click();}

    public boolean goBackWDHomePage() throws IOException, InterruptedException {
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src/screenshots.png"));
    //}

    //public boolean goToThirdTab() {
        //Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
        wdWait.until(ExpectedConditions.visibilityOf(mainHeader));
        Thread.sleep(5000);
        String bodyText = mainHeader.getText();
        return bodyText.contains("Actions");
    }
    public void openThirdTabDirectly(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://www.webdriveruniversity.com/Actions/index.html");
    }


    public void dragAndDrop()  {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement,droppableElement).build().perform();

    }

    public boolean invisibilityOfLink1(){
        //Boolean bool = new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class=('col-lg-12 text-center')]/div[1]/div[1]/div/a")));
        wdWait.until(ExpectedConditions.invisibilityOf(link1));
        return link1.isDisplayed();
    }

}












