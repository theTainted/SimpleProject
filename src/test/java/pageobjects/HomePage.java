package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class HomePage extends Utilities {

    SoftAssert softAssert =new SoftAssert();
    Utilities utilities = new Utilities();

    @FindBys(@FindBy(xpath = "//button/span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']"))
    List<WebElement> btnCloseNewsLetter;
    @FindBy(xpath="//input[@type='search']")
    WebElement txtSearchBox;
    @FindBy(xpath="//button[@class='c16__button icon']/span[@class='icon-search']")
    WebElement iconSearch;
    @FindBys(@FindBy(xpath="//a[@class='btn-cancel c09__close c09__close--cookie']"))
      List<WebElement> btnOnCookieAlert;
    @FindBy(xpath="//h1/span[@class='c11__title']")
    WebElement titleSearchResults;
    @FindBy(linkText="Netherlands")
    WebElement country;
    @FindBy(css="span.ui-selectmenu-text")
    WebElement countrySelector;
    @FindBys(@FindBy(xpath="//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']//ul[@id='country-selector-menu']/li"))
    List<WebElement>  listOfCountries;
    @FindBy(xpath="//button[@class='button button-large button-primary c13__country-selector-button-single']")
    WebElement btnGo;
    public HomePage(WebDriver driver) {

       // Utilities.driver=driver; //-> added after making the driver static
        PageFactory.initElements(driver,this);
    }

    public void clickOnbtnCloseNewsLetter(){
        int sizebtnCloseNewsLetter;
        sizebtnCloseNewsLetter = btnCloseNewsLetter.size();
        if (sizebtnCloseNewsLetter!=0){
            btnCloseNewsLetter.get(0).click();
        }

    }

    public void clickOnCookieAlert(){
        int sizebtnCookieAlert;
        sizebtnCookieAlert = btnOnCookieAlert.size();
        if(sizebtnCookieAlert!=0){

            btnOnCookieAlert.get(0).click();
        }
    }
    public void clickOnSearchIcon(){
        iconSearch.click();
    }
    public void enterSearchTextAndSearch(String searchText){
        if(txtSearchBox.isDisplayed()){

          txtSearchBox.click();
          txtSearchBox.clear();
          txtSearchBox.sendKeys(searchText);
          txtSearchBox.sendKeys(Keys.RETURN);
      /*    if(titleSearchResults.isDisplayed()) {
              softAssert.assertTrue(searchText.equals(titleSearchResults.getAttribute("data-search-q")));
              softAssert.assertAll();
          }*/


        }
        else {
            System.out.println("need to replace this with a logger");

        }

    }

    public void selectCountry(WebDriver driver,String partialCountryName){

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", country);
        countrySelector.click();
        ;
        int countryList = listOfCountries.size();
     //   System.out.println("CountryListSize : "+countryList);
        for (WebElement countryName: listOfCountries){
          //  System.out.println("Country Name : "+countryName.getText());
            if (countryName.getText().contains("ESP")){
                countryName.click();
                btnGo.click();
                break;
            }
        }
    }
}