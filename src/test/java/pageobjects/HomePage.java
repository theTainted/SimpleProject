package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {

    @FindBy(xpath = "//button/span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    WebElement btnCloseNewsLetter;


    public HomePage(WebDriver driver) {

        //  this.general.driver=driver;
        PageFactory.initElements(driver, this);
    }


}