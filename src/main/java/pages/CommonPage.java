package pages;

import core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage {

    protected WebDriver driver = DriverManager.getDriver();

    public CommonPage(){}

    protected void moveToElement(WebElement el){
        Actions action = new Actions(driver);
        action.moveToElement(el).build().perform();
    }

//    protected void waiVisibilityOf(WebElement el){
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//    }
}
