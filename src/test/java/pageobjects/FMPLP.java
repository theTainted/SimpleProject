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

    public FMPLP(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void enterSearchText(String sSearchText,WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(txtBoxSearch));
        txtBoxSearch.sendKeys(sSearchText);


    }

    public void clickSearchButton(){
        btnSearch.click();
    }
}
