import java.sql.SQLOutput;
import java.util.Scanner;

public class Days_21_equalSubString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int maxCost = sc.nextInt();
        int  ans = equalSubstring(s,t,maxCost);
        System.out.println(ans);
    }
        public  static int equalSubstring(String s, String t, int maxCost) {
            int j = 0;
            for (int i = 0; i < s.length(); ++i) {
                maxCost -= Math.abs(s.charAt(i) - t.charAt(i));
                if (maxCost < 0)
                    maxCost += Math.abs(s.charAt(j) - t.charAt(j++));
            }

            return s.length() - j;
        }

}
