package Lesson26_homework;

import Flow.HeaderFlow;
import Flow.SteamLoginFlow;
import Pages.Header;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Lesson26_homework.BaseTest.driver;

public class SteamLoginFlowTest extends BaseTest {

    private SteamLoginFlow steamLoginFlow;
    private HeaderFlow headerFlow;

    @BeforeEach
    public void setUp() {
        headerFlow = new HeaderFlow(driver);
        headerFlow.clickLoginButton();
        steamLoginFlow = new SteamLoginFlow(driver);
    }

    @Test

    public void loginFlowTest() {
        steamLoginFlow.setInputNameField("test");
        steamLoginFlow.setInputPasswordField("test123!");
        steamLoginFlow.clickLogin();
        Assertions.assertTrue(steamLoginFlow.getSteam_auth().getAuthError().isDisplayed());
    }


}
