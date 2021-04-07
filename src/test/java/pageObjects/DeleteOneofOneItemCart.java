package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteOneofOneItemCart {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public DeleteOneofOneItemCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By deleteItemOne = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    public void ClickDeleteFirstItem(){ldriver.findElement(deleteItemOne).click();}
}
