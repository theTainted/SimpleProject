package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class HomePage extends Utilities {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBy(xpath = "//button/span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    WebElement btnCloseNewsLetter;
    @FindBy(xpath="//input[@type='search']")
    WebElement txtSearchBox;
    @FindBy(xpath="//button[@class='c16__button icon']/span[@class='icon-search']")
    WebElement iconSearch;
    @FindBy(xpath="//a[@class='btn-cancel c09__close c09__close--cookie']")
    WebElement btnOnCookieAlert;
    @FindBy(xpath="//h1/span[@class='c11__title']")
    WebElement titleSearchResults;


    public HomePage(WebDriver driver) {

       // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }

    public void clickOnbtnCloseNewsLetter(){
        btnCloseNewsLetter.click();

    }
    public void clickOnCookieAlert(){
        if(btnOnCookieAlert.isDisplayed()){
            System.out.println("in here");
            btnOnCookieAlert.click();
        }
    }
    public void clickOnSearchIcon(){
        iconSearch.click();
    }
    public void enterSearchTextAndSearch(String searchText){
        if(txtSearchBox.isDisplayed()){

          txtSearchBox.click();
          txtSearchBox.clear();
          txtSearchBox.sendKeys(searchText);
          txtSearchBox.sendKeys(Keys.RETURN);
          softAssert.assertTrue(searchText.equals(titleSearchResults.getAttribute("data-search-q")));
          softAssert.assertAll();

        }
        else {
            System.out.println("Whats wrong");
        }

    }
}