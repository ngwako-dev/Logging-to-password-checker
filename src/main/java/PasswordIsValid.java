import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordIsValid {

    static int counter = 6;


    public static String passwordIsValid(String password) {


        String WhiteSpace = "";
        String results = "";
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);

        for (int i = 0; i < password.length(); i++) {

            c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasNum = true;
            }
            if (Character.isLowerCase(c)) {
                hasLow = true;
            }
            if (Character.isUpperCase(c)) {

                hasCap = true;
            }

        }
        if (!hasCap) {

            results += "Your passwords should have an uppercase.\n";
            counter--;
        }
        if (!hasLow) {
            results += "Your password should have a lowercase.\n";
            counter--;
        }
        if (!hasNum) {
            results += "Your password should have a number.\n";
            counter--;
        }
        if (sMatcher.matches()) {
            results += "Your password should have special character.\n";
            counter--;
        }
        if (password.length() <= 8) {
            results += "Your should be longer than 8.\n";
            counter--;
        }
        if (password.equals(WhiteSpace)) {

            results += "Your password should exist.\n";
            counter--;
        }

        return results;
    }

    public static String passwordIsOkay(String password) {
        String pass="";

        if (password.length() <= 8) {
            pass+= "User password is never ok";
        } else {
            pass += "User password is ok";
        }return pass;

    }
}

