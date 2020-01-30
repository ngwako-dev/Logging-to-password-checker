import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

         String password = "";
        logger.debug(PasswordIsValid.passwordIsOkay(password));


        logger.error(PasswordIsValid.passwordIsValid(password));





    }

}