public class Day12_Longest_Mountain_in_Array {
    class Solution {
        public int longestMountain(int[] arr) {
            int result = 0;
            int n = arr.length;
            if(n<3)return 0;

            int i = 0;
            boolean peak = false;
            boolean vally = false;

            while(i<n-1){
                if(arr[i]<arr[i+1]){
                    int start = i;

                    while(i<n-1 && arr[i] < arr[i+1]){
                        i++;
                        peak= true;
                    }
                    while(i<n-1 && arr[i] >arr[i+1]){
                        i++;
                        vally = true;
                    }
                    if(peak == true &&  vally==true){
                        result = Math.max(result,i-start+1);
                    }
                    peak = false;
                    vally = false;
                }
                else{
                    i++;
                }
            }


            return result;
        }
    }
}

