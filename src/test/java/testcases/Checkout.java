package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageobjects.Utilities;

public class Checkout {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

   @FindBy(xpath="//button[@name='dwfrm_login_unregistered']")
   public WebElement btnGuestUser;


    public  Checkout (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnGuestCheckout(){
        btnGuestUser.click();
    }
}
