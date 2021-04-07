package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {

    public WebDriver ldriver;
    WaitHelper waitHelper;

    public CategoriesPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By phonesCategory = By.xpath("//*[@id=\"itemc\"]");
    By previousBtn = By.xpath("//*[@id=\"prev2\"]");
    By nextBtn = By.xpath("//*[@id=\"next2\"]");
    By laptopsCategory = By.xpath("//*[@id=\"itemc\"]");
    By monitorsCategory = By.xpath("//*[@id=\"itemc\"]");

    public void ClickPhonesCategory(){ldriver.findElement(phonesCategory).click();}




    public void ClickPreviousBtn(){ldriver.findElement(previousBtn).click();}
    public void ClickNextBtn(){ldriver.findElement(nextBtn).click();}
    public void ClickLaptopsCategory(){ldriver.findElement(laptopsCategory).click();}
    public void ClickMonitorsCategory(){ldriver.findElement(monitorsCategory).click();}



}
