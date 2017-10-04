package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrialTestClass {
    @Test
    public void testTrialTestClass(){
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:/BrowserUtilities/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");

    }
}
