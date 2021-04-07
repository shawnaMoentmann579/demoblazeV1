package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    public WebDriver driver;

    public WaitHelper(WebDriver ldriver) {

    }

    public void WaitHelper(WebDriver driver)
    {
        this.driver = driver;
    }

    public void WaitForElement(WebElement element, long timeOutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"logInModal\\\"]/div/div/div[3]/button[2]")));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
