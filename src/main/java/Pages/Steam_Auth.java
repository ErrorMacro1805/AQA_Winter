package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Steam_Auth extends AbstractPage {

    private String url = "https://steamcommunity.com/login/home/?goto=";
    private static final By NAME = By.xpath("//*[@id=\"responsive_page_template_content\"]/div[1]/div[1]/div/div/div/div[2]/div/form/div[1]/input");
    private static final By PASSWORD = By.xpath("//input[@type='password']");
    private static final By BUTTON_SUBMIT = By.xpath("//button[@class='newlogindialog_SubmitButton_2QgFE']");

    private static final By AUTHERROR = By.xpath("//div[@class='newlogindialog_FormError_1Mcy9']");
    private static final By ACCHELP = By.xpath("//*[@id=\"responsive_page_template_content\"]/div[1]/div[1]/div/div/div/div[2]/div/form/a");

    public Steam_Auth(WebDriver driver) {
        super(driver);
    }

    public WebElement getName() {
        return driver.findElement(NAME);
    }

    public WebElement getPassword() {
        return driver.findElement(PASSWORD);
    }

    public WebElement getButtonSubmit() {
        return driver.findElement(BUTTON_SUBMIT);
    }

    public WebElement getAuthError() {
        return driver.findElement(AUTHERROR);
    }

    public WebElement getAccHelp() {
        return driver.findElement(ACCHELP);
    }

    public String getUrl() {
        return url;
    }
}
