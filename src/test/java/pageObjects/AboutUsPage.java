package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {

    public WebDriver ldriver;
    WaitHelper waitHelper;

    public AboutUsPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By AboutUsLink = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    //By PlayBtn = By.xpath("//*[@id=\"example-video\"]/div[4]/button[1]/span[2]");
    By PlayBtn = By.xpath("//*[@id=\"example-video\"]/button");
    By fullScreen = By.xpath("//*[@id=\"example-video\"]/div[4]/button[4]");
    By ExitFullScreen = By.xpath("//*[@id=\"example-video\"]/div[4]/button[4]");
    By videoElement = By.xpath("//*[@id=\"example-video_html5_api\"]");
    By CloseBtn = By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button");

    public void ClickAboutUs(){ldriver.findElement(AboutUsLink).click();}
    public void ClickPlayBtn(){ldriver.findElement(PlayBtn).click();}
    public void ClickFullScreen(){ldriver.findElement(fullScreen).click();}
    public void PlayVideo(){ldriver.findElement(videoElement).getAttribute("current time");}
    public void ClickExitFullScreen(){ldriver.findElement(ExitFullScreen).click();}
    public void ClickCloseBtn(){ldriver.findElement(CloseBtn).click();}
}
