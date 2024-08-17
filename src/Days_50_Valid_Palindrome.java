import java.util.Scanner;

public class Days_50_Valid_Palindrome {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove all non-alphanumeric characters and convert to lower case
        int i = 0;
        int j = s1.length() - 1;
        while (i <= j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
