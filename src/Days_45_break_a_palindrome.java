public class Days_45_break_a_palindrome {
    public static String breakPalindrome(String palindrome) {
        int n = palindrome.length();

        // If the length of the palindrome is 1, it's not possible to make it non-palindromic
        if (n == 1) return "";

        char[] chars = palindrome.toCharArray();

        // Traverse the first half of the string
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
        }

        // If all characters are 'a', change the last character to 'b'
        chars[n - 1] = 'b';
        return new String(chars);
    }

    public static void main(String[] args) {
        String palindrome1 = "abccba";
        String palindrome2 = "a";
        String palindrome3 = "aaa";

        System.out.println("Result for 'abccba': " + breakPalindrome(palindrome1)); // Output: "aaccba"
        System.out.println("Result for 'a': " + breakPalindrome(palindrome2));
        System.out.println("Result for 'aaa': " + breakPalindrome(palindrome3));
    }

}