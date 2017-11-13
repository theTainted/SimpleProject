package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingBasket {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

@FindBy(xpath="//div//button[@name='dwfrm_cart_checkoutCart')]")
public WebElement btnContinue;


    public  ShoppingBasket(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnContinueButton(){
        btnContinue.click();
    }
}
