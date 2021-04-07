package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OneMonitorItemCart {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public OneMonitorItemCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By MonitorsCategoryLink = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By MonitorFirstItem = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By MonitorAddToCart= By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public void ClickMonitorsCategory(){ldriver.findElement(MonitorsCategoryLink).click();}
    public void ClickFirstMonitorItem(){ldriver.findElement(MonitorFirstItem).click();}
    public void ClickMonitorAddToCart(){ldriver.findElement(MonitorAddToCart).click();}
}
