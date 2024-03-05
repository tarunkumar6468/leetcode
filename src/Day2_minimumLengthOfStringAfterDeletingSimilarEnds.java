import java.util.Scanner;

public class Day2_minimumLengthOfStringAfterDeletingSimilarEnds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // aabcaabba

        returnBalanceString(s); // answer = 3
    }
    public static void returnBalanceString(String s){
        int l = s.length();
        int left = 0;
        int right = l-1;
        while(left<right && s.charAt(left) == s.charAt(right)){
            int temp = s.charAt(left);
            while (left<=right && s.charAt(left)==temp){
                left++;
            }
            while(left<=right && s.charAt(right) == temp){
                right--;;
            }
        }
        System.out.print(right-left+1);
    }
}
