package Lesson26_homework;

import cash.WebDriverCash;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {


    protected static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverCash.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://www.dota2.com/home");
    }

    @AfterAll
    public static void driverTearDown() {
        driver.quit();

    }
}
