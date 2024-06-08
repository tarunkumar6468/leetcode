import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Days_23_Single_number_lll {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans [] = singleNumber(arr);
        for(int i = 0; i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }


    public static int[] singleNumber(int[]arr){
        // 1 2 1 2 4 5
        // output is  = 4 5
        Arrays.sort(arr);
        int []dumy = new int [2];
       for(int i = 0; i<arr.length-1; i++){
           if((arr[i]^arr[i+1])==0){
               i+=2;
           }
           else{
               dumy[0]=arr[i];
               dumy[1] = arr[arr.length-1];
           }
       }

        return dumy;
    }
}
