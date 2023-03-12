package cash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Objects;

public class WebDriverCash {

    private static WebDriver driver;

    private WebDriverCash(){}

    public static WebDriver getDriver(){
       if (Objects.nonNull(driver)){
           return driver;
       } else {
           System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
           driver = new EdgeDriver();
           return driver;

       }
    }
}

