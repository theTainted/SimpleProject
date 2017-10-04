package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.Utilities;

public class TrialTestClass extends Utilities{
    @Test
    public void testTrialTestClass(){



        driver.get("http://google.com");

    }
}
