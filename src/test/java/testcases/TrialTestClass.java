package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.Utilities;

public class TrialTestClass extends Utilities{
    Utilities utilities = new Utilities();
    HomePage homePage = new HomePage(driver);
 @Test

 public void testTrialTestClass(){
        driver.get(utilities.sURL);
        homePage.clickOnbtnCloseNewsLetter();

    }
}
