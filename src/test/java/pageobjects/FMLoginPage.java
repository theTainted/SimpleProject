package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class FMLoginPage {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBy(id="email")
    WebElement txtBoxLogin;
    @FindBy(id="password")
    WebElement txtBoxPassword;
    @FindBy(xpath="//div[@class='login_links_wrapper']/input[@class='btn btn--login btn-login']")
    WebElement btnLogin;
    @FindBys(@FindBy(xpath="//ul//div[@class='btn-group dropdown']/a"))
    List<WebElement> dropDownLoggedInOptions;




    public FMLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterLogin(String sEmail){
        txtBoxLogin.sendKeys(sEmail);
    }
    public void enterPassword(String sPassword){
        txtBoxPassword.sendKeys(sPassword);
    }
    public void clickLoginButton(){
        btnLogin.click();
        softAssert.assertTrue(dropDownLoggedInOptions.size()!=0,"User is logged in");
               }

}
