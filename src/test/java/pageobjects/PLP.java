package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class PLP {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();


    @FindBys(@FindBy(xpath="//div/a[@class='c05__thumb-link thumb-link']"))
    List<WebElement> plp;



    public PLP(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnTheFirstProductInPLP(){
        plp.get(0).click();
    }

}
