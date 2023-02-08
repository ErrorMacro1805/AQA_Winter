package Lesson15_homework;
import execeptions.WrongLogin;
import execeptions.WrongPasword;


public class StringChecker {

    private StringChecker() {
    }

    public static boolean checkLogin(String login) throws WrongLogin {
        if (login.length() < 20 && login.contains("_")) {
            return true;
        } else {
            throw new WrongLogin("Неверный логин");
        }

    }


    public static boolean checkPass(String password, String confirmPass) throws WrongPasword {
        if (password.length() < 20 && password.contains("_") && password.contains("!") && password.contains(confirmPass)) {
            return true;
        } else {
            throw new WrongPasword("Неверный пароль");
        }

    }
}














