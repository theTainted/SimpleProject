package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Utilities {
 /*  public static WebDriver driver; // changed to static
    public String sURL="https://"+"storefront"+":"+"storefront"+"@"+"staging.cortefiel.com/es/es";

    @BeforeClass
    @Parameters("browser")

   public static void setUp( String browser){ // changed to static



         if (browser.equalsIgnoreCase("Chrome"))

        {
            System.setProperty("webdriver.chrome.driver", "C:/BrowserUtilities/chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("inside the general");

        }
        else if (browser.equalsIgnoreCase("IE"))

        {
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability("ignoreZoomSetting", true);

            System.setProperty("webdriver.ie.driver", "C:/BrowserUtilities/IEDriverServer.exe");
            driver = new InternetExplorerDriver();


        }
        else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","C:/BrowserUtilities/geckodriver.exe");

            FirefoxDriver driver = new FirefoxDriver();


        }

    }*/
    public String sUrl= "http://t1.fleurametz.com";

}
