package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager extends TestWatcher {

    private static WebDriver driver;

    public DriverManager(){
        super();
    }

    @Override
    protected void starting(Description description){}

    @Before
    public void startScenario(Scenario scenario){}

    @After
    public void endScenario(){
        if(driver != null){
            driver.close();
            driver.quit();
            driver = null;
        }
    }
    public void finish(Description description){}

    public static WebDriver getDriver(){
        return driver;
    }

    public static void openBrowser(String url){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        Utils.setDriver();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

}
