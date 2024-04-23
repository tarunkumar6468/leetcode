import java.io.PrintStream;
import java.util.Scanner;

public class Days16_Product_of_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int []ans = ProductOfArray( arr);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] ProductOfArray(int []nums){
        int n = nums.length;
        int res [] = new int[n];
        res[0] = 1;
        for(int i = 1; i<n; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = n-1; i>=0; i--){
            res[i] = suffix*res[i];
            suffix = suffix*nums[i];
        }
        return res;
    }
}
