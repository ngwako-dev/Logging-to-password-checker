import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner Obj=new Scanner(System.in);

        System.out.println("Please enter your password :");
        String password=Obj.nextLine();



        System.out.println(PasswordIsValid.passwordIsValid(password));




    }

}