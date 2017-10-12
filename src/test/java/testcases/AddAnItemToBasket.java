package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.PDP;

import java.util.List;

public class AddAnItemToBasket {
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
    public void testAddAnItemToBasket() throws InterruptedException {
        driver.get(sURL);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnbtnCloseNewsLetter();
        homePage.clickOnCookieAlert();
        homePage.clickOnSearchIcon();
        homePage.enterSearchTextAndSearch("13223971004");
        Thread.sleep(5000);
        PDP pdp = new PDP(driver);
        pdp.clickOnFirstAvailableSize();
        pdp.clickAddToBasketButton();







    }

    }
