import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Days_22_Consecutive_Subsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        int ans = ConsecutiveSubSequence(arr,n);
        System.out.println(ans);

    }
    public static int ConsecutiveSubSequence(int []arr, int n){
        int ans  = 0;
        HashSet<Integer>set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i]-1)){
                int val = arr[i]+1;
                while (set.contains(val))val++;
                ans = Math.max(ans,val-arr[i]);
            }
        }
        return ans;
    }

}
