import java.util.Arrays;
import java.util.Scanner;

public class Days_28_Height_Checker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = height_Checker(arr);
        System.out.println(count);
    }
    public static int height_Checker(int[] height){
        int [] expected  = new int[height.length];
        for(int i = 0; i<height.length; i++) {
            if (height[i] <=height.length) {
                expected[i] = height[i];
            }
        }
        Arrays.sort(expected);
            int count = 0;
            for(int i =0; i<height.length; i++){
                if(height[i]!=expected[i]){
                    count++;
                }
            }
            return count;
    }
}
