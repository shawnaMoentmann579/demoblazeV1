package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultiplePhoneItemsCart {

    public WebDriver ldriver;
    WaitHelper waitHelper;

    public MultiplePhoneItemsCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By navBarHome = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By secondPhoneItem = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
    By addToCartBtn = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public void ClickNavHome(){ldriver.findElement(navBarHome).click();}
    public void ClickNokia(){ldriver.findElement(secondPhoneItem).click();}
    public void ClickAddToCartButton(){ldriver.findElement(addToCartBtn).click();}
}
