package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.FMLoginPage;
import pageobjects.Utilities;

import java.util.List;

public class FMLogin {
    public static WebDriver driver; // changed to static
   // public String sURL = "http://t2.fleurametz.com";
    Utilities utilities = new Utilities();

    @BeforeClass
    @Parameters("browser")

    public static void setUp(String browser) { // changed to static


        if (browser.equalsIgnoreCase("Chrome"))

        {
            System.setProperty("webdriver.chrome.driver", "C:/BrowserUtilities/chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser.equalsIgnoreCase("IE"))

        {
          /*  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability("ignoreZoomSetting", true);*/

            System.setProperty("webdriver.ie.driver", "C:/BrowserUtilities/IEDriverServer.exe");
            driver = new InternetExplorerDriver();


        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.firefox.marionette", "C:/BrowserUtilities/geckodriver.exe");

            FirefoxDriver driver = new FirefoxDriver();


        }
    }

    @Test
    public void testFMLogin(){
        driver.get(utilities.sUrl);
        driver.manage().window().maximize();
        FMLoginPage fmloginpage = new FMLoginPage(driver);
        fmloginpage.enterLogin("mobilexl@fleurametz.com");
        fmloginpage.enterPassword("lelie");
        fmloginpage.clickLoginButton();


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
