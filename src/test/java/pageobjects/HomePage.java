package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {
    Utilities utilities = new Utilities();

    @FindBy(xpath = "//button/span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    WebElement btnCloseNewsLetter;
    @FindBy(id="q")
    WebElement txtSearchBox;
    @FindBy(xpath="//button/span[@class='icon-search']")
    WebElement iconSearch;
    @FindBy(xpath="//a[@class='btn-cancel c09__close c09__close--cookie']")
    WebElement btnOnCookieAlert;


    public HomePage(WebDriver driver) {

       // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }

    public void clickOnbtnCloseNewsLetter(){
        btnCloseNewsLetter.click();

    }
    public void clickOnCookieAlert(){
        if(btnOnCookieAlert.isDisplayed()){
            btnOnCookieAlert.click();
        }
    }
    public void clickOnSearchIcon(){
        iconSearch.click();
    }
    public void enterSearchText(String searchText){
        txtSearchBox.sendKeys(searchText);
    }
}