import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        String password = "gA";
        logger.debug(PasswordIsOk.passwordIsOkay());


        logger.error(PasswordIsValid.passwordIsValid(password));
//        System.out.println(PasswordIsOk.passwordIsOkay());





    }

}