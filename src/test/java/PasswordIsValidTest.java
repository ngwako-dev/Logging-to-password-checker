import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordIsValidTest {

    @Test
    void passwordIsValid() {

        assertEquals("Your passwords should have an uppercase.\n" +
                "Your password should have a lowercase.\n" +
                "Your password should have a number.\n" +
                "Your password should have special character.\n" +
                "Your should be longer than 8.\n" +
                "Your password should exist.\n", PasswordIsValid.passwordIsValid(""));

        assertEquals("Your password should have a lowercase.\n" +
                    "Your password should have a number.\n" +
                    "Your password should have special character.\n" +
                    "Your should be longer than 8.\n", PasswordIsValid.passwordIsValid("T"));

        assertEquals("Your password should have a number.\n" +
                "Your password should have special character.\n" +
                "Your should be longer than 8.\n", PasswordIsValid.passwordIsValid("Tr"));

        assertEquals("Your password should have special character.\n" +
                              "Your should be longer than 8.\n", PasswordIsValid.passwordIsValid("Tr3"));

        assertEquals("Your should be longer than 8.\n", PasswordIsValid.passwordIsValid("Tr3@"));

        assertEquals("", PasswordIsValid.passwordIsValid("Tr3@78787"));
    }


    @Test
    void passwordIsOk() {
        assertEquals("User password is ok",PasswordIsValid.passwordIsOkay("1Ry5y2y37"));
        assertEquals("User password is never ok",PasswordIsValid.passwordIsOkay("112"));
    }
}