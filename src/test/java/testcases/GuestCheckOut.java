package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.*;

public class GuestCheckOut {
    public static WebDriver driver; // changed to static
    public String sURL = "https://" + "storefront" + ":" + "storefront" + "@" + "development.cortefiel.com/es/es";


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
    public void testGusetCheckOut() throws InterruptedException {
        driver.get(sURL);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnbtnCloseNewsLetter();
        homePage.clickOnCookieAlert();
        Thread.sleep(1000);
        // driver.findElement(By.xpath("//a[@class='btn-cancel c17__close c17__close--usp icon-close']")).click();
        homePage.selectCountry(driver, "ESP");
        Thread.sleep(2000);
        homePage.clickOnSearchIcon();
    homePage.enterSearchTextAndSearch("dress");
        Thread.sleep(5000);
        PLP plp = new PLP(driver);
        plp.clickOnTheFirstProductInPLP();
        PDP pdp = new PDP(driver);
        Thread.sleep(3000);
        pdp.clickOnFirstAvailableSize();
        Thread.sleep(1000);
        pdp.clickAddToBasketButton();
        pdp.clickOnMiniBasketIcon();
        ShoppingBasket sb = new ShoppingBasket(driver);
        sb.clickOnContinueButton();
        Checkout checkout = new Checkout(driver);
        checkout.clickOnGuestCheckout();
        checkout.clickOnShipmentMethods("domicilio");
        checkout.enterShippingAddressFirstName("tester");
        checkout.enterShippingAddressLastName("testerL");
        checkout.enterShippingAddressLine1("Line 1");
        checkout.enterShippingAddressPostalCode("28030");
    }
}