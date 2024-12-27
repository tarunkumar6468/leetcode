import java.net.Inet4Address;
import java.util.ArrayList;

public class Days_57_Indexs_of_sub_Array {
    public static void main(String[] args){
        int arr[] = {1,2,3,7,5};
        int target = 12;
        ArrayList<Integer> answer = ans(arr,target);
        System.out.println(answer);
    }
    public static ArrayList<Integer> ans (int arr[], int s){
     int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int currentSum = 0;
        int start = 0;

        // Traverse the array
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];  // Add the current element to the sum

            // Shrink the window from the left if the sum exceeds 's'
            while (currentSum > s && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // If the current sum equals 's', return the 1-based index range
            if (currentSum == s) {
                result.add(start + 1);  // 1-based index
                result.add(end + 1);    // 1-based index
                return result;  // Return the result immediately
            }
        }

        // If no subarray is found, return [-1]
        result.add(-1);
        return result;
    }
    }

