package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class CoretfielSearch {
    public static WebDriver driver; // changed to static
    public String sURL = "https://" + "storefront" + ":" + "storefront" + "@" + "staging.cortefiel.com/es/es";


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
    public void testCortefielSearch(){
        driver.get(sURL);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnbtnCloseNewsLetter();
      homePage.clickOnCookieAlert();
        homePage.clickOnSearchIcon();
      //  homePage.enterSearchTextAndSearch("13223971004");
        homePage.enterSearchTextAndSearch("rAincoat");

    }
  /*@AfterClass
    public void tearDown(){
        driver.quit();
    }*/

}
