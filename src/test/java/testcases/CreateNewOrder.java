package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.FMDashboard;
import pageobjects.FMLoginPage;
import pageobjects.FMPLP;
import pageobjects.Utilities;

import java.util.Date;
import java.util.List;

public class CreateNewOrder {
    public static WebDriver driver; // changed to static
    //  public String sURL = "http://t2.fleurametz.com";
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
    public void testCreateNewOrder() throws InterruptedException {
        driver.get(utilities.sUrl);
        driver.manage().window().maximize();
        FMLoginPage fmloginpage = new FMLoginPage(driver);
        fmloginpage.enterLogin("mobilexl@fleurametz.com");
        fmloginpage.enterPassword("lelie");
        fmloginpage.clickLoginButton();

        Thread.sleep(5000);
        FMDashboard fmDashboard = new FMDashboard(driver);
        fmDashboard.clickOnAnAvailableDateInTheCalendar("30");
        fmDashboard.clickOnOrderButton("Create new order");
        Thread.sleep(5000);
    /* List <WebElement> activeOption= driver.findElements(By.xpath("//article[@role='article']//div[@class='pre-selected-menu']//a[@class='active']"));
        System.out.println(activeOption.size());*/
        FMPLP fmplp = new FMPLP(driver);
        fmplp.enterSearchText("rosa", driver);
  /*
    // List<WebElement> tBody = driver.findElements(By.xpath("//table[@class='table-products']//tbody[@class='list']//tr//td[@class='tp-order']"));
 //List<WebElement> tBody = driver.findElements(By.xpath("//table[@class='table-products']//tbody[@class=' batch-first-item list']//tr//td[@class='tp-order']"));
 List<WebElement> tBody = driver.findElements(By.xpath("//table[@class='table-products']//tbody[contains(@class,'list')]//tr//td[@class='tp-order']"));
     System.out.println(tBody.size());
        int i=0;
        System.out.println(i);
        for (WebElement quantity : tBody) {
            System.out.println("Countrer :"+ i++);
            Actions actions = new Actions(driver);
            actions.moveToElement(quantity);
            actions.click();
            actions.sendKeys("6");
            actions.build().perform();
        }

    }
    @AfterClass

    public void tearDown(){
        driver.quit();
    }*/
    }
}











 /*     int Size =  driver.findElements(By.xpath("//div[@id='start-new-order-calendar']//button//span[@data-translate]")).size();
      System.out.println(Size);

     List <WebElement> createNewOrder=driver.findElements(By.xpath("//div[@id='start-new-order-calendar']//button//span[@data-translate='OrderActions.CreateNewOrder']"));

     for (WebElement newOrder : createNewOrder){
         System.out.println(newOrder.getText());
         if(newOrder.getText().equalsIgnoreCase("Create new order")){
             newOrder.click();
         }

     }*/
/*;
      if (driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[contains(text(),'Start nieuwe order')]")).isDisplayed()==true){
            System.out.println("in here");
        driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[contains(text(),'Start nieuwe order')]")).click();

     }
        else{
        driver.findElement(By.xpath("//div[@id='start-new-order-calendar']//span[contains(text(),'Open'")).click();

         List<WebElement> deliveryDateHasOrder = driver.findElements(By.xpath("//div[@id='start-new-order-calendar']/div/form//td[@class='delivery-order has-order']/a"));
     }

 List<WebElement> deliveryDateTodayHasOrder = driver.findElements(By.xpath("//div[@id='start-new-order-calendar']//form//table//td[@class='delivery-order active has-order today']"));

        List<WebElement> possibleDeliveryDatesWithNoOrders = driver.findElements(By.xpath("//div[@id='start-new-order-calendar']//form//table//td[@class='delivery']//a[@class='order-day-link']"));
        for (WebElement test : possibleDeliveryDatesWithNoOrders) {
            //  System.out.println(("Test:"+ test.getText()));

            Date date = new Date();
            // System.out.println(date);

            if (test.getText().equalsIgnoreCase("26")) {

                test.click();
                break;
            }


        }

    }
}*/


/*   int x = driver.findElements(By.xpath("//form[@class='variant-search__form']//fieldset/div[@class='field']//input[@class='text btn-inline variant-search__input']")).size();
   System.out.println(x);
        driver.findElement(By.xpath("//form[@class='variant-search__form']//fieldset/div[@class='field']//input[@class='text btn-inline variant-search__input']")).sendKeys("test");
 List <WebElement> searchBox = driver.findElements(By.xpath("//form[@class='variant-search__form']//fieldset/div[@class='field']"));
 for (WebElement y :searchBox){
     System.out.println(y.getText());
 }*/


/*
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='login-iframe']")));
int size=  driver.findElements(By.xpath("//div[@class='variant-search']")).size();
System.out.println(size);
List <WebElement> whatever = driver.findElements(By.xpath("//input[@class='text btn-inline variant-search__input']"));
for (WebElement s:whatever){
    System.out.println(s.getText());
}*/

//form[@class='variant-search__form']/fieldset/div/input
