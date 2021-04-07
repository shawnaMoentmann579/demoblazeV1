package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Steps extends BaseClass{

    @Before //this happens before all the test cases start
    public void setup() throws IOException {

        //Reading properties file
        configProp=new Properties();
        FileInputStream configPropFile = new FileInputStream("config.properties");
        configProp.load(configPropFile);

        String br = configProp.getProperty("browser");

        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));

            //System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();//Launch chrome browser
        }
        else if(br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
            driver = new FirefoxDriver();//Launch firefox browser
        }

    }

    @Given("user launches browser")
    public void user_launches_browser() {
        //driver object
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\smoentmann\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        //driver=new ChromeDriver();
        lp=new LoginPage(driver);
    }

    @When("user opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("clicks on Log in")
    public void clicks_on_Log_in() throws AWTException {
        lp.clickLogin();
    }

    @When("enters username and password")
    public void enters_username_and_password() throws InterruptedException {
        configProp.getProperty("username");
        driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(configProp.getProperty("username"));
        lp.setTxtUsername(configProp.getProperty("username"));

        configProp.getProperty("Password");
        driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(configProp.getProperty("Password"));
        lp.txtPassword(configProp.getProperty("Password"));

    }

    @When("clicks on login")
    public void clicks_on_login() throws InterruptedException, AWTException {
        lp.clickLoginBtn();

        Thread.sleep(3000);

    }

    @Then("page title should be {string}")
    public void page_title_should_be(String title) {
        //Capture title of page and then compare with expected. The login info could be incorrect so we
        // need to check
        if (driver.getPageSource().contains("User does not exist"))
        {
            driver.close();
            //this will make that test a failure if it contains that particular message
            Assert.assertTrue(false);
        }
        else
        {
            //comparing the title with the actual title. This title we get from the feature file
            //title gets expected title, getTitle() gets actual title
            Assert.assertEquals(title, driver.getTitle());
        }

    }

    @When("user clicks on log out")
    public void user_clicks_on_log_out() throws InterruptedException, AWTException {
        //lp.clickLogoutBtn();
        //wait for some time here
        Thread.sleep(3000);
    }

    @Then("close browser")
    public void close_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @When("enters invalid username as {string} and password as {string}")
    public void enters_invalid_username_as_and_password_as(String uname, String passwrd) throws InterruptedException {
        Thread.sleep(2000);
        lp.setTxtUsername(uname);
        Thread.sleep(2000);
        lp.txtPassword(passwrd);

        /*Alert simpleAlert = driver.switchTo().alert(); //switching to the alert box
        System.out.println(simpleAlert.getText());//getting the text from the alert box
        Thread.sleep(2000);
        simpleAlert.accept();//accepting the alert
        driver.quit();*/
    }

    /*@When("clicks ok in pop up")
    public void clicks_ok_in_pop_up() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15, 100)
        wait.until(ExpectedConditions.alertIsPresent())

        Alert simpleAlert = driver.switchTo().alert(); //switching to the alert box
        System.out.println(simpleAlert.getText());//getting the text from the alert box
        Thread.sleep(2000);
        simpleAlert.accept();//accepting the alert
        driver.quit();
    }*/



    //SignUp feature
    @When("clicks on SignUp")
    public void clicks_on_SignUp() throws InterruptedException {
        sup=new SignUpPage(driver);
        sup.clickSignup();
        Thread.sleep(2000);
    }

    @When("enters username as {string}")
    public void enters_username_as(String user) throws InterruptedException {
        sup.setTxtUsername(user);
        Thread.sleep(2000);
    }

    @When("enters password as {string}")
    public void enters_password_as(String pass) throws InterruptedException {
        sup.txtPassword(pass);
        Thread.sleep(2000);

    }

    @When("clicks on Sign Up")
    public void clicks_on_Sign_Up() throws InterruptedException {
        sup.clickSignUpBtn();
        Thread.sleep(3000);

        Alert simpleAlert = driver.switchTo().alert(); //switching to the alert box
        System.out.println(simpleAlert.getText());//getting the text from the alert box
        Thread.sleep(2000);
        simpleAlert.accept();//accepting the alert

    }

    //1 phone item to cart
    @When("clicks on Samsung galaxy")
    public void clicks_on_Samsung_galaxy_s() throws InterruptedException {
        opic=new OnePhoneItemCart(driver);
        Thread.sleep(3000);
        opic.clickGalaxyPhone();
        Thread.sleep(3000);
    }

    @When("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() throws InterruptedException, AWTException {
        opic= new OnePhoneItemCart(driver);
        opic.clickAddToCartBtn();
        //Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alert.accept();
        /*if (driver.getWindowHandle().contains("product added")){
            Alert simpleAlert = driver.switchTo().alert(); //switching to the alert box
            System.out.println(simpleAlert.getText());
            Thread.sleep(2000);
            simpleAlert.accept();
            Thread.sleep(2000);}*/
    }


    @When("clicks cart in the nav bar")
    public void clicks_cart_in_the_nav_bar() throws InterruptedException {
        opic= new OnePhoneItemCart(driver);
        opic.clickNavCartLink();
        Thread.sleep(2000);

    }

    @Then("user should see item in the cart")
    public void user_should_see_item_in_the_cart() {

    }

    @When("user clicks on place order")
    public void user_clicks_on_place_order() throws InterruptedException {
        Thread.sleep(2000);
        opic.clickPlaceOrderBtn();

    }

    @When("enters information")
    public void enters_information() throws InterruptedException {
        Thread.sleep(3000);
        opic.setTxtName("Jael Zendaya");
        Thread.sleep(2000);
        opic.setTxtCountry("USA");
        Thread.sleep(2000);
        opic.setTxtCity("De Soto");
        Thread.sleep(2000);
        opic.setTxtCreditCard("0101010101010101");
        Thread.sleep(2000);
        opic.setTxtCreditCardMonth("03");
        Thread.sleep(2000);
        opic.setTxtCreditCardYear("2030");
        Thread.sleep(2000);

    }

    @When("clicks purchase")
    public void clicks_purchase() {
        opic.clickPurchaseBtn();

    }

    @Then("user should see purchase confirmation message")
    public void user_should_see_purchase_confirmation_message() {
    }

    @Then("clicks ok")
    public void clicks_ok() throws InterruptedException {
        Thread.sleep(3000);
        opic.clickOkBtn();
    }

    //Multiple phone items in cart
    @When("clicks on nav bar home")
    public void clicks_on_nav_bar_home() throws InterruptedException {
        mpic= new MultiplePhoneItemsCart(driver);
        mpic.ClickNavHome();
        Thread.sleep(2000);
    }

    @When("clicks on Nokia lumia")
    public void clicks_on_Nokia_lumia() throws InterruptedException {
        mpic.ClickNokia();
        Thread.sleep(2000);
    }

    @When("user clicks on add to cart again")
    public void user_clicks_on_add_to_cart_again() throws InterruptedException, AWTException {
        mpic.ClickAddToCartButton();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alert.accept();

        /*if (driver.getWindowHandle().contains("product added")){
            Alert simpleAlert = driver.switchTo().alert(); //switching to the alert box
            System.out.println(simpleAlert.getText());
            Thread.sleep(2000);
            simpleAlert.accept();
            Thread.sleep(2000);}*/
    }

    //One laptop item cart
    @When("clicks on laptops")
    public void clicks_on_laptops() throws InterruptedException {
        olic= new OneLaptopItemCart(driver);
        olic.ClickLaptopCategory();
        Thread.sleep(2000);

    }
    @When("clicks on Sony vaio")
    public void clicks_on_Sony_vaio() throws InterruptedException {
        olic= new OneLaptopItemCart(driver);
        olic.ClickFirstLaptopItem();
        Thread.sleep(2000);
    }

    @When("user clicks on add to cart for laptop")
    public void user_clicks_on_add_to_cart_for_laptop() {
        olic.ClickLaptopAddToCart();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alert.accept();
    }

    // Multiple laptops in cart
    @When("clicks on MacBook Air")
    public void clicks_on_MacBook_Air() throws InterruptedException {
        mlic= new MultiplelaptopItemCart(driver);
        mlic.ClickSecondLaptopItem();
        Thread.sleep(3000);

    }

    //One Monitor in cart
    @When("clicks on Apple Monitor")
    public void clicks_on_Apple_Monitor() throws InterruptedException {
        omic = new OneMonitorItemCart(driver);
        omic.ClickFirstMonitorItem();
        Thread.sleep(2000);
    }

    @When("user clicks on add to cart for monitor")
    public void user_clicks_on_add_to_cart_for_monitor() throws InterruptedException {
        omic.ClickMonitorAddToCart();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alert.accept();

    }

    //Multiple Monitors in cart
    @When("clicks on ASUS FULL HD")
    public void clicks_on_ASUS_FULL_HD() throws InterruptedException {
        mmic = new MultipleMonitorItemsCart(driver);
        mmic.ClickSecondMonitorItem();
        Thread.sleep(2000);

    }

    //Delete one of one item from the cart
    @When("user clicks delete")
    public void user_clicks_delete() throws InterruptedException {
        dooic = new DeleteOneofOneItemCart(driver);
        dooic.ClickDeleteFirstItem();
        //Thread.sleep(3000);
    }

    @Then("cart should be empty")
    public void cart_should_be_empty() {

    }

    //Delete multiple items from cart
    @When("clicks on iPhone")
    public void clicks_on_iPhone() throws InterruptedException {
        dmic = new DeleteMultipleItemsCart(driver);
        dmic.ClickIPhoneLink();
        Thread.sleep(3000);
    }

    @When("user clicks on add to cart once again")
    public void user_clicks_on_add_to_cart_once_again() throws InterruptedException {
        dmic.ClickIPhoneAddToCartBtn();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println(driver.switchTo().alert().getText());
        alert.accept();
    }

    @When("user clicks delete again")
    public void user_clicks_delete_again() throws InterruptedException {
        dmic.ClickDeleteSecondItem();
        Thread.sleep(3000);

    }

    //About us page
    @When("clicks on nav About Us")
    public void clicks_on_nav_About_Us() throws InterruptedException {
        aup=new AboutUsPage(driver);
        aup.ClickAboutUs();
        Thread.sleep(3000);
    }

    @When("Clicks play")
    public void clicks_play() throws InterruptedException {

        aup.ClickPlayBtn();
        aup.ClickFullScreen();
        //Thread.sleep(3000);
    }

    @Then("user should hear the video")
    public void user_should_hear_the_video() throws InterruptedException {
        aup.PlayVideo();
        Thread.sleep(10000);
        aup.ClickExitFullScreen();
    }

    @Then("clicks close")
    public void clicks_close() throws InterruptedException {
        aup.ClickCloseBtn();
        Thread.sleep(3000);

    }

    @Then("user clicks pause icon")
    public void user_clicks_pause_icon() throws InterruptedException {
        aupap = new AboutUsPlayAndPause(driver);
        aupap.ClickPauseIcon();
        Thread.sleep(3000);

    }

    @Then("clicks play icon")
    public void clicks_play_icon() {
        aupap.ClickPlayIcon();

    }

    //Mute Video
    @Then("user clicks mute button")
    public void user_clicks_mute_button() throws InterruptedException {
        aumv = new AboutUsMuteVideo(driver);
        aumv.ClickMuteBtn();
        Thread.sleep(3000);
        aumv.ClickMuteBtn();
    }

    //Pic in Pic
    @Then("user clicks picture in picture button")
    public void user_clicks_picture_in_picture_button() throws InterruptedException {
        aupip = new AboutUsPictureInPicture(driver);
        aupip.ClickPicNPicBtn();
        Thread.sleep(3000);
        aupip.ClickPicNPicBtn();
    }

    //Contact page
    @When("clicks on nav Contact")
    public void clicks_on_nav_Contact() throws InterruptedException {
        cp=new ContactPage(driver);
        cp.ClickContactLink();
        Thread.sleep(3000);

    }

    @When("enters contact information")
    public void enters_contact_information() throws InterruptedException {
        cp.setContactEmail("Example@example.com");
        Thread.sleep(2000);
        cp.setContactName("Jael Zendaya");
        Thread.sleep(2000);
        cp.setMessage("Hello World!");
        Thread.sleep(2000);
    }

    @When("clicks Send message")
    public void clicks_Send_message() throws InterruptedException {
        cp.clickSendMessage();
        Thread.sleep(3000);
        Alert simpleAlert = driver.switchTo().alert(); //switching to the alert box
        System.out.println(simpleAlert.getText());//getting the text from the alert box
        Thread.sleep(2000);
        simpleAlert.accept();//accepting the alert
        Thread.sleep(2000);
    }

    @When("enters contact {string} and {string} and {string}")
    public void enters_contact_and_and(String email, String name, String message) throws InterruptedException {
        cp.setContactEmail(email);
        Thread.sleep(2000);
        cp.setContactName(name);
        Thread.sleep(2000);
        cp.setMessage(message);
        Thread.sleep(2000);
    }

    @When("enters invalid contact {string} and {string} and {string}")
    public void enters_invalid_contact_and_and(String string, String string2, String string3) {

    }


    //Logo
    @When("clicks on logo image")
    public void clicks_on_logo_image() throws InterruptedException {
        l=new Logos(driver);
        l.ClickLogoImage();
        Thread.sleep(2000);
    }

    @When("clicks on logo text")
    public void clicks_on_logo_text() throws InterruptedException {
        l=new Logos(driver);
        l.ClickLogoText();
        Thread.sleep(2000);
    }

    @When("clicks on close")
    public void clicks_on_close() throws InterruptedException {
        l.ClickBtnClose();
        Thread.sleep(2000);
    }

    //Categories/PreviousNextButtons
    @When("clicks on Phone Category")
    public void clicks_on_Phone_Category() throws InterruptedException {
        cat=new CategoriesPage(driver);
        cat.ClickPhonesCategory();
        Thread.sleep(2000);
    }

    @When("clicks on Previous")
    public void clicks_on_Previous() throws InterruptedException {
        cat.ClickPreviousBtn();
        Thread.sleep(2000);

    }

    @When("user clicks on next")
    public void user_clicks_on_next() throws InterruptedException {
        cat.ClickNextBtn();
        Thread.sleep(2000);

    }

    @When("clicks on Laptops Category")
    public void clicks_on_Laptops_Category() throws InterruptedException {
        cat=new CategoriesPage(driver);
        Thread.sleep(3000);
        cat.ClickLaptopsCategory();


    }

    @When("clicks on Monitors Category")
    public void clicks_on_Monitors_Category() throws InterruptedException {
        cat=new CategoriesPage(driver);
        cat.ClickMonitorsCategory();
        Thread.sleep(2000);
    }


}
