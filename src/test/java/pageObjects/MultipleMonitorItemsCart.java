package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultipleMonitorItemsCart {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public MultipleMonitorItemsCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By monitorsCategoryLink = By.linkText("Monitors");
    By SecondMonitorItem = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
    By MonitorAddToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public void ClickMonitorsCategory(){ldriver.findElement(monitorsCategoryLink).click();}
    public void ClickSecondMonitorItem(){ldriver.findElement(SecondMonitorItem).click();}
    public void ClickMonitorAddToCart(){ldriver.findElement(MonitorAddToCart).click();}
}
