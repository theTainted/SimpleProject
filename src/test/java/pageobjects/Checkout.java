package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pageobjects.Utilities;

import java.util.List;

public class Checkout {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBy(xpath="//button[@name='dwfrm_login_unregistered']")
    public WebElement btnGuestUser;
    @FindBy(id="dwfrm_singleshipping_inStoreShipments_homedelivery_true")
    public WebElement rdoHomeDelivery;
    @FindBys(@FindBy(xpath="//span[@class='control radio']//label[@class='control-label']"))
    public List<WebElement> labelsShippingMethods;

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
    public void clickOnShipmentMethods(String partialShippingMethodLabel){
        for(WebElement shippingMethod:labelsShippingMethods){
            System.out.println(shippingMethod.getText());
            if(shippingMethod.getText().contains("Recoger ")){
                shippingMethod.click();
                break;
            }
        }
    }
}