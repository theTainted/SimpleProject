package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class FMDashboard {
    SoftAssert softAssert = new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBys(@FindBy(xpath ="//div[@id='start-new-order-calendar']//button//span[@data-translate='OrderActions.CreateNewOrder']"))
    List<WebElement> createNewOrder;


    public FMDashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void clickOnOrderButton(String sOrderButtonLabel) {
        for (WebElement newOrder : createNewOrder) {
            if (newOrder.getText().equalsIgnoreCase(sOrderButtonLabel)) {
                System.out.println("clickOnOrderButton");
                newOrder.click();
                break;
            }
        }
    }
}
