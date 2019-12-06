import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordIsValid {

    static int counter =6;


    public  static String passwordIsValid(String password) {



        String WhiteSpace="";
        String results="";
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
        if(!hasCap){

            results+= "Oops!!!: Your passwords should have an uppercase.\n";
            counter--;
        }
        if(!hasLow){
            results+="Oops!!!: Your password should have a lowercase.\n";
            counter--;
        }
        if(!hasNum){
            results+="Oops!!!: Your password should have a number.\n";
            counter--;
        }
        if(sMatcher.matches()){
            results+="Oops!!!: Your password should have special character.\n";
            counter--;
        }
        if(password.length()<=8){
            results+="Oops!!!: Your should be longer than 8.\n";
            counter--;
        }
        if(password.equals(WhiteSpace)){

            results+="Oops!!! Your password should exist.\n";
            counter--;
        }
        if (password.length()<=8) {
            results+="Password is never okay.";
        }
        return results;
    }

}

