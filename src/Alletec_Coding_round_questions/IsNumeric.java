package Alletec_Coding_round_questions;
import java.util.Scanner;

public class IsNumeric {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;      // Null or empty string is not numeric
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {     // Check if each character is a digit
                return false;
            }
        }
        return true;       // All characters are digits
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        boolean result = isNumeric(input); // Call the function
        if (result) {
            System.out.println("The string is numeric.");
        } else {
            System.out.println("The string is not numeric.");
        }


    }
}
