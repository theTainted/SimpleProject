package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {
    Utilities utilities = new Utilities();

    @FindBy(xpath = "//button/span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    WebElement btnCloseNewsLetter;


    public HomePage(WebDriver driver) {

       // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }

    public void clickOnbtnCloseNewsLetter(){
        btnCloseNewsLetter.click();

    }
}