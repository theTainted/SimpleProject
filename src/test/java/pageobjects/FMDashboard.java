package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.Date;
import java.util.List;

public class FMDashboard {
    SoftAssert softAssert = new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBys(@FindBy(xpath="//div[@id='start-new-order-calendar']//form//table//td[@class='delivery']//a[@class='order-day-link']"))
    List<WebElement> possibleDeliveryDatesWithNoOrders;

    @FindBys(@FindBy(xpath ="//div[@id='start-new-order-calendar']//button//span[@data-translate]"))
    List<WebElement> createNewOrder;


    public FMDashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    public void clickOnAnAvailableDateInTheCalendar(String sDate) {
        for (WebElement test : possibleDeliveryDatesWithNoOrders) {
            Date date = new Date();
            // System.out.println(date);
            if (test.getText().equalsIgnoreCase(sDate)) {
                test.click();
                break;
            }
        }
    }

    public void clickOnOrderButton(String sOrderButtonLabel) {
        for (WebElement newOrder : createNewOrder) {
            if (newOrder.getText().equalsIgnoreCase(sOrderButtonLabel)) {
               // System.out.println("clickOnOrderButton");
                newOrder.click();
                break;
            }
        }
    }
}
