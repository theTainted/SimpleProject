package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingBasket {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

@FindBy(xpath="button button-large button-primary button-block")
public WebElement btnContinue;


    public  ShoppingBasket(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnContinueButton(){
        btnContinue.click();
    }
}
