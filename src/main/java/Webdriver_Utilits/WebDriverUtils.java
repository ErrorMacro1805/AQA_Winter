package Webdriver_Utilits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverUtils {
    public static WebDriver getDriver(String driver) {
        switch (driver) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new ChromeDriver();
            case "edge":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new EdgeDriver();

            default:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new ChromeDriver();
        }
    }
}