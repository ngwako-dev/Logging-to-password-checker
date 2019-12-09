
class PasswordIsOk {


    public static String passwordIsOkay(String Password) {
        String result = " ";
        String[] arr = PasswordIsValid.passwordIsValid(Password).split("-");
        int metConditions = 6 - arr.length;

        if (metConditions < 3) {
            result += "Password is not okay";
        } else {
            result += "Password is okay";
        }
        return result;
    }
}
