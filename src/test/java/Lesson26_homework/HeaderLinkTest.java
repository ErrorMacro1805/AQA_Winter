package Lesson26_homework;

import Flow.HeaderFlow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeaderLinkTest extends BaseTest {
    private HeaderFlow headerFlow;

    @BeforeEach
    public void setUp() {
        driver.get("https://www.dota2.com/home");
        headerFlow = new HeaderFlow(driver);
    }

    public void testClickLogoButton() {
        headerFlow.clickLogoButton();
        String expectedUrl = "https://www.dota2.com/home";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testHoverGameButton() {
        headerFlow.hoverGameButton();
        WebElement gameMenu = headerFlow.getGameMenu();
        assertTrue(gameMenu.isDisplayed());
    }

    @Test
    public void testClickHeroesButton() {
        headerFlow.clickHeroesButton();
        String expectedUrl = "https://www.dota2.com/heroes";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testClickNewsButton() {
        headerFlow.clickNewsButton();
        String expectedUrl = "https://www.dota2.com/news";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testClickCyberportButton() {
        headerFlow.clickCybersportButton();
        String expectedUrl = "https://www.dota2.com/esports/spring23/schedule";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testClickLoginButton() {
        headerFlow.clickLoginButton();
        String expectedUrl = "https://steamcommunity.com/oauth/loginform/?";
        String actualUrl = driver.getCurrentUrl();
        assertTrue(actualUrl.contains(expectedUrl));
    }

    @Test
    public void testSteamButton() {
        headerFlow.clickSteamButton();
        String expectedUrl = "https://store.steampowered.com/app/570/Dota_2/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testHoverLanguageSelector() {
        headerFlow.hoverLanguageSelector();
        WebElement languageSelector = headerFlow.getLanguageSelector();
        assertTrue(languageSelector.isDisplayed());
    }
}