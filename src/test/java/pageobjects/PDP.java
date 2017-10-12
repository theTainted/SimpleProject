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

    @FindBys(@FindBy(xpath="//div[@id='product-content']//div[@class='c02__sizes']//ul[@class='swatches c02__size-list size-list']//a"))
     public   List<WebElement> sizePresent;
    @FindBy(id="add-to-cart")
    public WebElement btnAddToBasket;



    public PDP (WebDriver driver) {

        // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }
    public void clickOnFirstAvailableSize(){
        for (int i=0;i<sizePresent.size();i++){

            String size =sizePresent.get(i).getText();
            String titleSize =sizePresent.get(i).getAttribute("title");
            if(titleSize.toLowerCase().indexOf("not available") == -1){

                sizePresent.get(i).click();
                System.out.println(sizePresent.get(i).getText());
                break;
            }

        }
    }
    public void clickAddToBasketButton(){
        btnAddToBasket.click();
    }
}
