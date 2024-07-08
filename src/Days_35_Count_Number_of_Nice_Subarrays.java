import java.util.HashMap;


/**Given an array of integers nums and an integer k.
A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.
 Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].**/
public class Days_35_Count_Number_of_Nice_Subarrays {
    public static void main(String[] args){
        int arr[] = {1,1,2,1,1};
        int k = 3;
        int ans = CountNiceArray(arr,k);
        System.out.println(ans);

        int sAns = secondMethod1(arr,k);
        System.out.println(sAns);

        int thirdAns =  thirdMethod(arr,k);
        System.out.println(thirdAns);
    }
   public static int CountNiceArray(int []arr, int k){
        int count  = 0;
        int  prefixSum = 0;
       HashMap<Integer, Integer>mp = new HashMap<>();
       mp.put(0,1);
       for(int num :arr){
           if(num%2==1){
               prefixSum++;
           }
           if(mp.containsKey(prefixSum-k)){
               count+=mp.get(prefixSum-k);
           }
           mp.put(prefixSum,mp.getOrDefault(prefixSum,0)+1);
       }
        return count;
   }
    public static int secondMethod(int [] arr, int k){
        int i = 0;
        int j = 0;
        int odd = 0;
        int ans = 0;
        while(j<arr.length){
            if(arr[i]%2==1){
                odd++;
            }
            while(odd>k){
                if(arr[i]%2==1){
                    odd--;
                }
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
    public static int secondMethod1(int[]arr, int k){
        return secondMethod(arr,k)-secondMethod(arr,k-1);
    }

    public static int thirdMethod(int[] arr, int k){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int oddCount = 0;
           for(int j = i; j<arr.length; j++){
               if(arr[j]%2!=0){
                   oddCount++;
               }
               if(oddCount==k){
                   count++;
               }
               else if(oddCount>k)break;

           }
        }
        return count;
    }
}
