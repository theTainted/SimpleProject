package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class PLP {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();



    public PLP(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


}
