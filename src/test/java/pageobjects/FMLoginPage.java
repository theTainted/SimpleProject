package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class FMLoginPage {
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBy(id="email")
    WebElement txtBoxLogin;
    @FindBy(id="password")
    WebElement txtBoxPassword;
    @FindBy(xpath="//div[@class='login_links_wrapper']/input[@class='btn btn--login btn-login']")
    WebElement btnLogin;




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
    }
}
