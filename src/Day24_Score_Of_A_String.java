public class Day24_Score_Of_A_String {
    public static void main(String[] args){
        String s = "hello";

        int ans  = stringScore(s);
        System.out.println(ans);
    }
    public static int stringScore(String s){
        int score = 0;
       int i = 0;
       int j = 1;
       while(i<s.length()-1 && j<s.length()) {
           char ch = s.charAt(i);
           int first = (int)ch;
           char ch1 = s.charAt(j);
           int second = (int)ch1;
           score += Math.abs(first - second);
           i++;
           j++;
       }
       return score;
    }
}
