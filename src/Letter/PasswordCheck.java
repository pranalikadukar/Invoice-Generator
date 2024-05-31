package Letter;

import java.util.Scanner;

public class PasswordCheck {public static void checkPassword(String password) {
    int upperChars = 0, lowerChars = 0, specialChars = 0, digits = 0, length;
    char ch;
    length = password.length();

    if (length < 6) {
        System.out.println("Password must be at least 6 characters long!\n");
        return;
    } else {
        for (int i = 0; i < length; i++) {
            ch =  password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperChars++;
            } else if (Character.isLowerCase(ch)) {
                lowerChars++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }
    }

    if (upperChars != 0 && lowerChars != 0 && digits != 0 && specialChars != 0) {
        if (length >= 10) {
            System.out.println("The strength of password is strong.\n");
        } else {
            System.out.println("The strength of password is medium.\n");
        }
    } else {
        if (upperChars == 0)
            System.out.println("Password must contain at least one uppercase character!\n");
        if (lowerChars == 0)
            System.out.println("Password must contain at least one lowercase character!\n");
        if (specialChars == 0)
            System.out.println("Password must contain at least one special character!\n");
        if (digits == 0)
            System.out.println("Password must contain at least one digit!\n");
    }
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter password: ");
    String password = scan.nextLine();
     System.out.print( password.charAt(0));

    scan.close();

    checkPassword(password);
}
}