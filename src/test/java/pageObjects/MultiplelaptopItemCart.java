package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultiplelaptopItemCart {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public MultiplelaptopItemCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By LaptopSecondItem = By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");

    public void ClickSecondLaptopItem(){ldriver.findElement(LaptopSecondItem).click();}
}
