package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OneLaptopItemCart {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public OneLaptopItemCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By LaptopCategoryLink = By.xpath("//*[@id=\"itemc\"]");
    By LaptopFirstItem = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By LaptopAddToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public void ClickLaptopCategory(){ldriver.findElement(LaptopCategoryLink).click();}
    public void ClickFirstLaptopItem(){ldriver.findElement(LaptopFirstItem).click();}
    public void ClickLaptopAddToCart(){ldriver.findElement(LaptopAddToCart).click();}
}
