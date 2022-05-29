// All Test Pages are inheriting from this class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {
    protected WebDriver driver;

    public Pageobject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}