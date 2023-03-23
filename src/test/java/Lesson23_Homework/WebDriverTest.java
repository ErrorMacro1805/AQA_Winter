package Lesson23_Homework;

import cash.WebDriverCash;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverTest {

    WebDriver driver = WebDriverCash.getDriver("e");

    @BeforeAll
    public static void setUp() {
        WebDriver driver = WebDriverCash.getDriver("e");
        driver.manage().window().maximize();
    }


    @Test
    public void closePopup() {

        driver.get("https://novaposhta.ua/");
        driver.findElement(By.xpath("//*[@id=\"popup_info\"]/div[1]/i")).click();

    }


    @Test

    public void testSearchfield() {

        driver.get("https://novaposhta.ua/");
        driver.findElement(By.xpath("//*[@id=\"popup_info\"]/div[1]/i")).click();
        WebElement searchField = WebDriverCash.getDriver("e").findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/div/div[2]/input"));
        Assertions.assertTrue(searchField.isDisplayed(), "Search field is not present on the page");
    }


    @Test

    public void testPhoneValidationMessage() {

        driver.get("https://novaposhta.ua/");

        WebElement closeButton = driver.findElement(By.xpath("//*[@id=\"popup_info\"]/div[1]/i"));
        closeButton.click();

        WebElement buttonEntry = driver.findElement(By.xpath("//*[@id=\"user_menu\"]/a[1]/span"));
        buttonEntry.click();

        WebElement buttonRegistration = driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/section[1]/div/div[1]/div/a/span[1]"));
        buttonRegistration.click();

        WebElement phoneField = driver.findElement(By.xpath("//label[@class='q-field row no-wrap items-start q-field--standard q-input q-field--error q-field--highlighted']//input[@class='q-field__native q-placeholder']"));
        phoneField.sendKeys("661234567");
        phoneField.clear();
        WebElement requiredField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/form/div[1]/label/div/div[2]/div/div"));
        Assertions.assertTrue(requiredField.isDisplayed(), "Required field message is not present");
    }

    @AfterAll
    public static void finishExecution() {
        WebDriver driver = WebDriverCash.getDriver("e");
        driver.quit();
    }
}








