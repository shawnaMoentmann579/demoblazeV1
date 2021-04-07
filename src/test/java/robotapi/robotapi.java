package robotapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class robotapi {

    public Object LoginKeys;

    public void LoginKeys () throws AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\smoentmann\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_TAB); //Press tab key
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER); //Press enter key




    }
}
