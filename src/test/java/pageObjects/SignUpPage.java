package pageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public WebDriver ldriver;
    WaitHelper waitHelper;

    public SignUpPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);
    }

    //Page elements
    By SignupLink = By.xpath("//*[@id=\"signin2\"]");
    By txtUsername = By.xpath("//*[@id=\"sign-username\"]");
    By txtPassword = By.xpath("//*[@id=\"sign-password\"]");
    By signUpBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    //Action Methods
    public void clickSignup(){ldriver.findElement(SignupLink).click();}
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
    public void clickSignUpBtn()
    {

        ldriver.findElement(signUpBtn).click();}

}
