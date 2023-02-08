package Lesson15_homework;

import execeptions.WrongLogin;
import execeptions.WrongPasword;

public class Test {


    public static void main(String[] args) throws WrongLogin, WrongPasword {
        LoginFormDTO user1 = new LoginFormDTO("MyLogin123","|Qwerty123!","Qwerty1231");
        user1.checkcreds(user1.getLogin(), user1.getPassword(), user1.getPasswordConfirmation());
    }

    }



