package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPictureInPicture {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public AboutUsPictureInPicture(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By picNPicBtn = By.xpath("//*[@id=\"example-video\"]/div[4]/button[3]");

    public void ClickPicNPicBtn(){ldriver.findElement(picNPicBtn).click();}
}
