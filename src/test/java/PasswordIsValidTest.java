import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordIsValidTest {

    @Test
    void passwordIsValid() {

        assertEquals("Oops!!!: Your passwords should have an uppercase.\n" +
                "Oops!!!: Your password should have a lowercase.\n" +
                "Oops!!!: Your password should have a number.\n" +
                "Oops!!!: Your password should have special character.\n" +
                "Oops!!!: Your should be longer than 8.\n" +
                "Oops!!! Your password should exist.\n" +
                "Password is never okay.", PasswordIsValid.passwordIsValid("Tr3@"));

//        assertEquals("Oops!!!: Your password should have a lowercase.\n" +
//                "Oops!!!: Your password should have a number.\n" +
//                "Oops!!!: Your password should have special character.\n" +
//                "Oops!!!: Your should be longer than 8.\n" +
//                "Password is never okay.", PasswordIsValid.passwordIsValid("T"));
//
//        assertEquals("Oops!!!: Your password should have a number.\n" +
//                "Oops!!!: Your password should have special character.\n" +
//                "Oops!!!: Your should be longer than 8.\n" +
//                "Password is never okay.", PasswordIsValid.passwordIsValid("Tr"));
//
//        assertEquals("Oops!!!: Your password should have special character.\n" +
//                "Oops!!!: Your should be longer than 8.\n" +
//                "Password is never okay.", PasswordIsValid.passwordIsValid("Tr3"));
//
//        assertEquals("Oops!!!: Your should be longer than 8.\n" +
//                "Password is never okay.", PasswordIsValid.passwordIsValid("Tr3@"));
//
//        assertEquals("", PasswordIsValid.passwordIsValid("Tr3@78787"));
//    }
//
//
//    @Test
//    void passwordIsOkay() {
//        assertTrue(PasswordIsOkay.passwordIsOkay());
    }
}