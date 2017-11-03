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

    @FindBys(@FindBy(xpath="//div[@class='c02__sizes']//ul[@class='swatches c02__size-list size-list']//li[@class='c02__size-item swatch-item available']//a"))
     public   List<WebElement> sizePresent;
    @FindBy(id="add-to-cart")
    public WebElement btnAddToBasket;



    public PDP (WebDriver driver) {

        // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }
    public void clickOnFirstAvailableSize(){
        String firstAvailableSize=sizePresent.get(0).getText();

        sizePresent.get(0).click();

    }
    public void clickAddToBasketButton(){
        System.out.println(btnAddToBasket.isDisplayed());
        btnAddToBasket.click();
    }
}
