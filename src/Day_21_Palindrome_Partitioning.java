import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_21_Palindrome_Partitioning {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(partition(s));
    }
    public  static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void   dfs (final String s, int start, List<String>ans,List<List<String>>result){
        if(s.length()==start){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i = start; i<s.length(); i++){
            if(isPalindromeOrNot(s,start,i)){
                ans.add(s.substring(start, i+1));
                dfs(s,i+1,ans,result);
                ans.remove(ans.size()-1);
            }
        }
    }
    private static boolean isPalindromeOrNot(String s, int l, int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }

}
