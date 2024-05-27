import java.awt.*;
import java.util.HashSet;
import java.util.Scanner;

public class Days20_Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = findMaxK(arr);
        System.out.println(res);
    }
    public static  int findMaxK(int[] nums) {
// 1 -1 3 -3 2 -2
        HashSet<Integer>set = new HashSet<>();

        for(int i : nums){
            if(i<0){
                set.add(i);
            }
        }
        int max = -1;
        for(int j:nums){
            if(j>0 && set.contains(-j)){
                int curr = j;
                max = Math.max(curr,max);
            }
        }
        return max;
    }
}
