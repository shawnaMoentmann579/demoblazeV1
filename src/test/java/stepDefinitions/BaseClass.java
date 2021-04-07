package stepDefinitions;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
import robotapi.robotapi;

import java.util.Properties;

public class BaseClass {
    //For all the steps, these variables are required
    //this must be extended to the stepsDefinitions class
    //We need a driver. we make public so we can access in other packages. Required
    public WebDriver driver;

    //need to access the page object classes. Required
    public LoginPage lp;
    public SignUpPage sup;
    public robotapi r;
    public OnePhoneItemCart opic;
    public MultiplePhoneItemsCart mpic;
    public AboutUsPage aup;
    public ContactPage cp;
    public Logos l;
    public CategoriesPage cat;
    public OneLaptopItemCart olic;
    public MultiplelaptopItemCart mlic;
    public OneMonitorItemCart omic;
    public MultipleMonitorItemsCart mmic;
    public DeleteOneofOneItemCart dooic;
    public DeleteMultipleItemsCart dmic;
    public AboutUsPlayAndPause aupap;
    public AboutUsMuteVideo aumv;
    public AboutUsPictureInPicture aupip;
    public Properties configProp;

}
