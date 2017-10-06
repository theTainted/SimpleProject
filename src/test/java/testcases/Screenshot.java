package testcases;

import java.io.File;



import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Screenshot {
        public static WebDriver driver; // changed to static
        public String sURL = "https://www.laprairie.com.au/au/home?ncr=true";
        @BeforeClass
        @Parameters("browser")

        public static void setUp(String browser) { // changed to static


            if (browser.equalsIgnoreCase("Chrome"))

            {
                System.setProperty("webdriver.chrome.driver", "C:/BrowserUtilities/chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("inside the general");

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
        public void takeScreenShotExample(){



                System.setProperty("webdriver.chrome.driver", "C:/BrowserUtilities/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.navigate().to("https://www.laprairie.com.au/au/home?ncr=true");
            new AShot()
                    .shootingStrategy(ShootingStrategies.viewportPasting(100))
                    .takeScreenshot(driver);

            try {
                getscreenshot();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void getscreenshot() throws Exception
        {
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,250)", "");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("C:\\screenshot1.png"));
        }
    }




