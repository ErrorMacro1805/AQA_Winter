package Lesson15_homework;

import execeptions.WrongLogin;
import execeptions.WrongPasword;

public class LoginFormDTO {
    private String login;
    private String password;
    private String passwordConfirmation;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public LoginFormDTO(String login, String password, String passwordConfirmation) {
        this.login = login;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public boolean checkcreds(String login, String password, String passwordConfirmation) throws WrongLogin, WrongPasword {
        try {
            return (StringChecker.checkLogin(getLogin()) && StringChecker.checkPass(getPassword(), getPasswordConfirmation()));
        } catch (WrongLogin e) {
            System.out.println(e.getMessage());
        } catch (WrongPasword e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}