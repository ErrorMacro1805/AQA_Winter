package execeptions;

public class WrongPasword extends Exception{
    private String message;

    public WrongPasword(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

