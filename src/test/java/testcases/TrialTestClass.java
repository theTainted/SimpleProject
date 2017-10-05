package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.Utilities;

public class TrialTestClass extends Utilities{

    Utilities utilities = new Utilities();

    HomePage homePage = new HomePage(utilities.driver);
 @Test

 public void testTrialTestClass(){
        utilities.driver.get(sURL);
        homePage.clickOnbtnCloseNewsLetter();

    }
}
