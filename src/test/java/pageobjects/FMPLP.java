package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;

import static testcases.CreateNewOrder.driver;

public class FMPLP {
    Utilities utilities = new Utilities();
    SoftAssert softAssert = new SoftAssert();


@FindBy(xpath="//form[@class='variant-search__form']//fieldset/div[@class='field']//input[@class='text btn-inline variant-search__input']")
    WebElement txtBoxSearch;

@FindBy(xpath="//form[@class='variant-search__form']//fieldset/div[@class='field']//button[@class='button btn-search variant-search__submit']")
    WebElement btnSearch;

@FindBy(xpath="//div[@class='filter-sticky__filters']/a[@class='filter-sticky__link']/span[@class='filter-sticky__link-text']")
    WebElement stickyFilterText;
    public FMPLP(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void enterSearchText(String sSearchText,WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(txtBoxSearch));
        txtBoxSearch.sendKeys(sSearchText);
        clickSearchButton();
       String sFilterText=stickyFilterText.getText();
        softAssert.assertTrue(sFilterText.equalsIgnoreCase(sSearchText),"the sticky filter text and search crteria donot match");
        softAssert.assertAll();


    }

    public void clickSearchButton(){
        btnSearch.click();
    }
}
//div[@class='filter-sticky__filters']/a[@class='filter-sticky__link']/span[@class='filter-sticky__link-text']