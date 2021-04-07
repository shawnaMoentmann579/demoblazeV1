package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPlayAndPause {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public AboutUsPlayAndPause(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By pauseIcon = By.xpath("//*[@id=\"example-video\"]/div[4]/button[1]");
    By playIcon = By.xpath("//*[@id=\"example-video\"]/div[4]/button[1]");

    public void ClickPauseIcon(){ldriver.findElement(pauseIcon).click();}
    public void ClickPlayIcon(){ldriver.findElement(playIcon).click();}


}
