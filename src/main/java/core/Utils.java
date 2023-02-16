package core;

public class Utils {

    protected static void setDriver(){
        String driverPath = "src/main/resources/drivers/";
        if(System.getProperty("os.name").contains("Windows")){
            driverPath = driverPath + "chromedriver.exe";
        }else{
            driverPath = driverPath + "chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
    }
}
