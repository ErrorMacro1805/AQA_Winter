package execeptions;

import java.io.IOException;

public class WrongLogin extends IOException {
    private String message;

    public WrongLogin(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

