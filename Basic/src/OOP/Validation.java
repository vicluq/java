package OOP;

public class Validation {
    public static boolean validateEmail(String email) {
        return email.indexOf('@') > 0;
    }

    public static boolean validatePassword(String password) {
        return password.length() >= 6; 
    }
}   
