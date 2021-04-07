package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logos {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public Logos(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By logoImage = By.xpath("//*[@id=\"nava\"]/img");
    By logoText = By.xpath("//*[@id=\"nava\"]/text()");
    By BtnClose = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");

    public void ClickLogoImage(){ldriver.findElement(logoImage).click();}
    public void ClickLogoText(){ldriver.findElement(logoText).click();}
    public void ClickBtnClose(){ldriver.findElement(BtnClose).click();}

}
