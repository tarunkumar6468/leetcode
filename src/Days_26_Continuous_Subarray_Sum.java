import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Days_26_Continuous_Subarray_Sum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int  k = sc.nextInt();
      for(int i  = 0; i<n; i++){
          arr[i]=sc.nextInt();
      }
        System.out.println(checkSubarraySum(arr,k));

    }
    public  static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // To handle edge case where the subarray starts from index 0
        int sum = 0;
// [23,2,4,6,6]

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) > 1) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }
}
