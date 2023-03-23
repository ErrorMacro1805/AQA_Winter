package Flow;

import Pages.Steam_Auth;
import org.openqa.selenium.WebDriver;

public class SteamLoginFlow {
    private Steam_Auth steam_auth;

    public SteamLoginFlow(WebDriver driver) {
        this.steam_auth = new Steam_Auth(driver);
    }

    public void login(String name, String password) {
        setInputNameField(name);
        setInputPasswordField(password);
        clickLogin();
    }

    public void setInputNameField(String nameField) {
        steam_auth.getName().clear();
        steam_auth.getName().sendKeys(nameField);
    }

    public void setInputPasswordField(String passwordField) {
        steam_auth.getPassword().clear();
        steam_auth.getPassword().sendKeys(passwordField);
    }

    public void clickLogin() {
        steam_auth.getButtonSubmit().click();
    }

    public void clickAccHelp() {
        steam_auth.getAccHelp().click();
    }

    public String getAuthErrorText() {
        return steam_auth.getAuthError().getText();
    }

    public Steam_Auth getSteam_auth() {
        return steam_auth;
    }
}
