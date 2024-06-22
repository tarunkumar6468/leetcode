import java.util.HashMap;

public class Days_35_Count_Number_of_Nice_Subarrays {
    public static void main(String[] args){
        int arr[] = {1,1,2,1,1};
        int k = 3;
//        int ans = CountNiceArray(arr,k);
//        System.out.println(ans);

        int sAns = secondMethod1(arr,k);
        System.out.println(sAns);
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
}
