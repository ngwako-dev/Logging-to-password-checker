import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        String password = "s";
        logger.debug(PasswordIsOk.passwordIsOkay(password));
//        logger.info(PasswordIsValid.passwordIsValid(""));
//        logger.warn("Hello this is a warning message");
        logger.error(PasswordIsValid.passwordIsValid(password));
//        logger.fatal("Hello this is a fatal message");



//        Scanner Obj=new Scanner(System.in);

//        System.out.println("Please enter your password :");
//        String password=Obj.nextLine();



//        System.out.println(PasswordIsValid.passwordIsValid(password));




    }

}