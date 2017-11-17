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
   @FindBy(id="dwfrm_singleshipping_inStoreShipments_homedelivery_true")
   public WebElement rdoHomeDelivery;

    public  Checkout (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnGuestCheckout(){
        btnGuestUser.click();
    }
    public void selectradioButtonHomeDelivery(){
       String value = rdoHomeDelivery.getAttribute("value");
        System.out.println(value);
    }
}
