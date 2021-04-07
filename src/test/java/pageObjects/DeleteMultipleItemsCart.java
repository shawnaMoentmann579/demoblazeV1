package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteMultipleItemsCart {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public DeleteMultipleItemsCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By iPhoneLink = By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a");
    By iPhoneAddToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By deleteSecondItem = By.xpath("//*[@id=\"tbodyid\"]/tr[3]/td[4]/a");

    public void ClickIPhoneLink(){ldriver.findElement(iPhoneLink).click();}
    public void ClickIPhoneAddToCartBtn(){ldriver.findElement(iPhoneAddToCart).click();}
    public void ClickDeleteSecondItem(){ldriver.findElement(deleteSecondItem).click();}
}
