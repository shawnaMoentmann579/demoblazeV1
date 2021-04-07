package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public WebDriver ldriver;
    WaitHelper waitHelper;

    public ContactPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    By ContactLink = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By ContactEmail = By.xpath("//*[@id=\"recipient-email\"]");
    By ContactName = By.xpath("//*[@id=\"recipient-name\"]");
    By Message = By.xpath("//*[@id=\"message-text\"]");
    By SendMessage = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    public void ClickContactLink(){ldriver.findElement(ContactLink).click();}
    public void setContactEmail(String email){ldriver.findElement(ContactEmail).sendKeys(email);}
    public void setContactName(String name){ldriver.findElement(ContactName).sendKeys(name);}
    public void setMessage(String message){ldriver.findElement(Message).sendKeys(message);}
    public void clickSendMessage() throws InterruptedException {ldriver.findElement(SendMessage).click();
        if (ldriver.getWindowHandle().contains("Please enter")){
            Alert simpleAlert = ldriver.switchTo().alert(); //switching to the alert box
            System.out.println(simpleAlert.getText());
            Thread.sleep(2000);
            simpleAlert.accept();
            Thread.sleep(2000);}

    }



}
