

class PasswordIsOk {

    public static String passwordIsOkay() {
        String result="";


        if (PasswordIsValid.counter < 3) {
           result += "Password is not okay";

        } else {
            result += "Password is okay";
        }
        return result;
    }
}
