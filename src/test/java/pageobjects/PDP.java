package pageobjects;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.FindBys;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.asserts.SoftAssert;

        import java.util.List;

public class PDP extends Utilities{
    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBys(@FindBy(xpath="//div[@id='product-content']/ul[@class='swatches c02__size-list size-list']/li"))
     public   List<WebElement> sizes;



    public PDP (WebDriver driver) {

        // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }
}
