package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class OnePhoneItemCart {

    public WebDriver ldriver;
    WaitHelper waitHelper;

    public OnePhoneItemCart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By firstPhoneItem = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By addToCartBtn = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By cartNavLink = By.xpath("//*[@id=\"cartur\"]");
    By placeOrderBtn = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By txtName = By.xpath("//*[@id=\"name\"]");
    By txtCountry = By.xpath("//*[@id=\"country\"]");
    By txtCity = By.xpath("//*[@id=\"city\"]");
    By txtCreditCard = By.xpath("//*[@id=\"card\"]");
    By txtCCMonth = By.xpath("//*[@id=\"month\"]");
    By txtCCYear = By.xpath("//*[@id=\"year\"]");
    By purchaseBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By okBtn = By.xpath("/html/body/div[10]/div[7]/div/button");

    public void clickGalaxyPhone(){ldriver.findElement(firstPhoneItem).click();}
    public void clickAddToCartBtn() throws AWTException, InterruptedException {
        ldriver.findElement(addToCartBtn).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(ldriver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = ldriver.switchTo().alert();
        System.out.println(ldriver.switchTo().alert().getText());
        alert.accept();
        //WebDriverWait wait = new WebDriverWait(ldriver, 15, 100);
        //wait.until(ExpectedConditions.alertIsPresent());

        /*if (ldriver.getWindowHandle().contains("product added")){
            Alert simpleAlert = ldriver.switchTo().alert(); //switching to the alert box
            System.out.println(simpleAlert.getText());
            Thread.sleep(2000);
            simpleAlert.accept();
            Thread.sleep(2000);}*/
        }


    public void clickNavCartLink() throws InterruptedException {

        Thread.sleep(2000);
        ldriver.findElement(cartNavLink).click();
    }
    public void clickPlaceOrderBtn(){ldriver.findElement(placeOrderBtn).click();}
    public void setTxtName(String name)
    {
        ldriver.findElement(txtName).clear();
        ldriver.findElement(txtName).sendKeys(name);
    }

    public void setTxtCountry(String country)
    {
        ldriver.findElement(txtCountry).clear();
        ldriver.findElement(txtCountry).sendKeys(country);
    }

    public void setTxtCity(String city)
    {
        ldriver.findElement(txtCity).clear();
        ldriver.findElement(txtCity).sendKeys(city);
    }

    public void setTxtCreditCard(String cc)
    {
        ldriver.findElement(txtCreditCard).clear();
        ldriver.findElement(txtCreditCard).sendKeys(cc);
    }

    public void setTxtCreditCardMonth(String ccMonth)
    {
        ldriver.findElement(txtCCMonth).clear();
        ldriver.findElement(txtCCMonth).sendKeys(ccMonth);
    }

    public void setTxtCreditCardYear(String ccYear)
    {
        ldriver.findElement(txtCCYear).clear();
        ldriver.findElement(txtCCYear).sendKeys(ccYear);
    }

    public void clickPurchaseBtn(){ldriver.findElement(purchaseBtn).click();}
    public void clickOkBtn(){ldriver.findElement(okBtn).click();}







}
