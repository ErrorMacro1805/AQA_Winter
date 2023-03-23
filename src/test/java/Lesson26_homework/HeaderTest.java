package Lesson26_homework;

import Pages.Header;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeaderTest extends BaseTest {
    private Header header;

    @BeforeEach
    public void setUp() {
        header = new Header(driver);
    }

    @Test
    public void testHeaderElementsExist() {
        assertTrue(header.getLogoButton().isDisplayed());
        assertTrue(header.getGameButton().isDisplayed());
        assertTrue(header.getHeroesButton().isDisplayed());
        assertTrue(header.getNewsButton().isDisplayed());
        assertTrue(header.geCybersportButton().isDisplayed());
        assertTrue(header.getLoginButton().isDisplayed());
        assertTrue(header.getLanguageSelector().isDisplayed());
        assertTrue(header.getSteamButton().isDisplayed());
    }
}
