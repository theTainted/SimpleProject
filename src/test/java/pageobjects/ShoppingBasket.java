package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ShoppingBasket {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

@FindBy(xpath="//form[@id='checkout-form']//button[@class='button button-large button-primary button-block']")
public WebElement btnContinue;

    public  ShoppingBasket(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnContinueButton(){
        btnContinue.click();
    }


}

