package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutUsMuteVideo {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public AboutUsMuteVideo(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By muteBtn = By.xpath("//*[@id=\"example-video\"]/div[4]/div[1]/button");

    public void ClickMuteBtn(){ldriver.findElement(muteBtn).click();}
}
