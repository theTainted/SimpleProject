package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.PDP;
import pageobjects.PLP;

import java.util.List;

public class AddAnItemToBasket {
    public static WebDriver driver; // changed to static
    public String sURL = "https://" + "storefront" + ":" + "storefront" + "@" + "demo.cortefiel.com/es/es";


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
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//a[@class='btn-cancel c17__close c17__close--usp icon-close']")).click();
        homePage.selectCountry(driver,"Esp");
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









    }

    }
/* WebElement country = driver.findElement(By.linkText("Netherlands"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", country);
        driver.findElement(By.cssSelector("span.ui-selectmenu-text")).click();
        List <WebElement> listOfCountries = driver.findElements(By.xpath("//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']//ul[@id='country-selector-menu']/li"));
        int countryList = driver.findElements(By.xpath("//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']//ul[@id='country-selector-menu']/li")).size();
        System.out.println("CountryListSize : "+countryList);
        for (WebElement countryName: listOfCountries){
            System.out.println("Country Name : "+countryName.getText());
            if (countryName.getText().contains("ESP")){
                countryName.click();
                driver.findElement(By.xpath("//button[@class='button button-large button-primary c13__country-selector-button-single']")).click();
                break;
            }
        }*/