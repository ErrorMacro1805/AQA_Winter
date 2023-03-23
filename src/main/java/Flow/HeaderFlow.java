package Flow;

import Pages.Header;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HeaderFlow {
    private Header header;
    private WebDriver driver;
    private Actions actions;

    private static final By GAMEMENU = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[1]/div[2]");
    private static final By LANGUAGESELECTOR = By.xpath("//*[@id=\"dota_react_root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[2]");

    public HeaderFlow(WebDriver driver) {
        this.header = new Header(driver);
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void clickLogoButton() {
        header.getLogoButton().click();
    }

    public void hoverGameButton() {
        WebElement gameButton = header.getGameButton();
        actions.moveToElement(gameButton).perform();
    }

    public void clickHeroesButton() {
        header.getHeroesButton().click();
    }

    public void clickNewsButton() {
        header.getNewsButton().click();
    }

    public void clickCybersportButton() {
        header.geCybersportButton().click();
    }

    public void clickLoginButton() {
        header.getLoginButton().click();
    }

    public void hoverLanguageSelector() {
        WebElement languageSelect = header.getLanguageSelector();
        actions.moveToElement(languageSelect).perform();

    }

    public void clickSteamButton() {
        header.getSteamButton().click();
    }

    public WebElement getGameMenu() {
        return driver.findElement(GAMEMENU);
    }

    public WebElement getLanguageSelector() {
        return driver.findElement(LANGUAGESELECTOR);
    }
}
