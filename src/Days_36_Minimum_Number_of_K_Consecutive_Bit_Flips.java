import java.util.Scanner;

public class Days_36_Minimum_Number_of_K_Consecutive_Bit_Flips {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
     int ans = minKBitFlips(arr,k);
        System.out.println(ans);
    }
    public static int minKBitFlips(int[] nums, int k){
        int n = nums.length;
        // nums = 0 1 0
        // k = 1
        int count = 0;
        int i = 0;
        int j = k;
        int k1 = k;
        while(j<n){
            while(k1>0) {
                if (nums[i] == 0) {
                    int b = i;
                    while(k1>0){
                        nums[b] = ~nums[b];
                        k1--;
                        b++;
                    }
                }
                else if(k1==0) {
                    count++;
                }
//                else {
//                    return -1;
//                }
            }
            j++;
            i++;
            k1 = k;

        }
        for(int a=0;a<n;a++){
            if(nums[a]==0){
                return -1;
            }
        }
        return count;
    }
}
