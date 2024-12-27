public class Days_56_maximum_sum_of_sub_array {
    public static void main(String[] args){
        int arr[] = {100,200,300,400};
        int k = 2;

        int ans = printSumofSubArray(arr, k);
        System.out.println(ans);

        }

    public static int printSumofSubArray(int arr[], int k){
        int maxSum = 0;
       int sum = 0;
       int index = 0;
           while (index<arr.length && index<k){
                sum+=arr[index];
                index++;
            }
            maxSum = sum;
      for(int i =1 ; i<arr.length-k+1;i++){
          int pre = arr[i-1];
          int next = arr[i+k-1];
          sum = sum - pre+next;
          maxSum = Math.max(maxSum,sum);
      }
return maxSum;
    }

}
