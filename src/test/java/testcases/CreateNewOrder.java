package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.FMLoginPage;

import java.util.Date;
import java.util.List;

public class CreateNewOrder {
    public static WebDriver driver; // changed to static
    public String sURL = "http://t2.fleurametz.com";


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
    public void testCreateNewOrder() throws InterruptedException {
        driver.get(sURL);
        driver.manage().window().maximize();
        FMLoginPage fmloginpage = new FMLoginPage(driver);
        fmloginpage.enterLogin("mobilexl@fleurametz.com");
        fmloginpage.enterPassword("lelie");
        fmloginpage.clickLoginButton();

        List<WebElement> deliveryDateHasOrder = driver.findElements(By.xpath("//div[@id='start-new-order-calendar']/div/form//td[@class='delivery-order has-order']/a"));

        Thread.sleep(2000);
        List<WebElement> deliveryDateTodayHasOrder = driver.findElements(By.xpath("//div[@id='start-new-order-calendar']//form//table//td[@class='delivery-order active has-order today']"));

        List<WebElement> possibleDeliveryDatesWithNoOrders = driver.findElements(By.xpath("//div[@id='start-new-order-calendar']//form//table//td[@class='delivery']//a[@class='order-day-link']"));
        for (WebElement test :possibleDeliveryDatesWithNoOrders) {
        //    System.out.println(("Test:"+ test.getText()));

            Date date = new Date();
         //   System.out.println(date);

            if (test.getText().equalsIgnoreCase("18")) {
                test.click();
                break;
            }



        }
Thread.sleep(2000);
      if (driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[contains(text(),'Start nieuwe order')]")).isDisplayed()==true){
            System.out.println("in here");
        driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[contains(text(),'Start nieuwe order')]")).click();

     }
        else if (driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[@data-translate ='OrderActions.OpenOrder']")).isDisplayed()==true){
          System.out.println("in heres");
        driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[@data-translate ='OrderActions.OpenOrder']")).click();
     }



    }
}





