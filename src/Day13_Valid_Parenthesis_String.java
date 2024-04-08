import java.util.Scanner;

public class Day13_Valid_Parenthesis_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {

//        int start = 0;
//        int end = 0;
//        for(int i = 0; i<s.length(); i++){
//            if(s.charAt(i)=='('){
//                start++;
//                end++;
//            }
//            else if(s.charAt(i)==')'){
//                start--;
//                end--;
//            }
//            else{
//                start++;
//                end--;
//            }
//            if(start<0)return false;
//            end  = Math.max(0,end);
//
//        }
//        return end == 0;


        // 2ND SOLUTION 
        int star = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                star++;

            }
            if (s.charAt(i) == '(') {
                left++;
            }
            if (s.charAt(i) == ')') {

                if (left > 0) {
                    left--;
                } else if (star > 0) {
                    star--;
                } else {
                    return false;
                }
            }


        }
        star = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                star++;

            }
            if (s.charAt(i) == ')') {
                right++;
            }
            if (s.charAt(i) == '(') {

                if (right > 0) {
                    right--;
                } else if (star > 0) {
                    star--;
                } else {
                    return false;
                }

            }

        }

        return true;
        //return false;
    }
}
