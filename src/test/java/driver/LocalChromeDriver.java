package driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocalChromeDriver {

    public static WebDriver driver;
    private static final String filePath = "src/main/resources/web_driver/chromedriver.exe";

    public static void init(){
        System.out.println("Chrome driver");
        System.setProperty("webdriver.chrome.driver", filePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void close(){
        try {
            driver.quit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            driver = null;
        }
    }


}
