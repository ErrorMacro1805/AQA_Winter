package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends AbstractPage {

    private static final By LOGO_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/a");
    private static final By GAME_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[1]/div[1]");
    private static final By HEROES_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[1]/a[1]");
    private static final By NEWS_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[1]/a[2]");
    private static final By CYBERSPORT_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[1]/a[3]");
    private static final By LOGIN_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[2]/div/a");
    private static final By LANGUAGE_SELECTOR = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/span");
    private static final By STEAM_BUTTON = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[2]/a/div/div[2]");


    public Header(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoButton() {
        return driver.findElement(LOGO_BUTTON);
    }

    public WebElement getGameButton() {
        return driver.findElement(GAME_BUTTON);
    }

    public WebElement getHeroesButton() {
        return driver.findElement(HEROES_BUTTON);
    }

    public WebElement getLoginButton() {
        return driver.findElement(LOGIN_BUTTON);
    }

    public WebElement getNewsButton() {
        return driver.findElement(NEWS_BUTTON);
    }

    public WebElement geCybersportButton() {
        return driver.findElement(CYBERSPORT_BUTTON);
    }

    public WebElement getLanguageSelector() {
        return driver.findElement(LANGUAGE_SELECTOR);
    }

    public WebElement getSteamButton() {
        return driver.findElement(STEAM_BUTTON);

    }

}

