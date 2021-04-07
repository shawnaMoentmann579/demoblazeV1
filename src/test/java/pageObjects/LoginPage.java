package pageObjects;

import Utilities.WaitHelper;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginPage {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public LoginPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);

    }

    //Page elements
    By loginLink = By.xpath("//*[@id=\"login2\"]");
    By txtUsername = By.xpath("//*[@id=\"loginusername\"]");
    By txtPassword = By.xpath("//*[@id=\"loginpassword\"]");
    By btnLogin = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By btnLogout = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");



    //Action Methods
    public void clickLogin(){ldriver.findElement(loginLink).click();}
    public void setTxtUsername(String uname)
    {
        ldriver.findElement(txtUsername).clear();
        ldriver.findElement(txtUsername).sendKeys(uname);
    }
    public void txtPassword(String pswd)
    {
        ldriver.findElement(txtPassword).clear();
        ldriver.findElement(txtPassword).sendKeys(pswd);
    }
    public void clickLoginBtn() throws AWTException, InterruptedException {

        ldriver.findElement(btnLogin).click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_TAB); //Press tab key
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER); //Press enter key


        if (ldriver.getWindowHandle().contains("wrong password")){
            Alert simpleAlert = ldriver.switchTo().alert(); //switching to the alert box
            System.out.println(simpleAlert.getText());
            Thread.sleep(2000);
            simpleAlert.accept();
            Thread.sleep(2000);}

        }

        public void clickLogoutBtn(){ldriver.findElement(btnLogout).click();}


}
