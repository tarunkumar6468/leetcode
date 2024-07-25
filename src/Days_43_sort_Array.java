import java.util.Random;

public class Days_43_sort_Array {

        public static void main(String[] args){
            int n  = 4;
            int arr[]  = {5,1,1,2,0,0};
            int ans[] = sortArray(arr);
            for(int i = 0; i<ans.length; i++){
                System.out.print(ans[i] + " ");
            }
        }


        private static final Random RANDOM = new Random();

        public static int[] sortArray(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        private static void quickSort(int[] nums, int low, int high) {
            if (low < high) {
                int pi = randomizedPartition(nums, low, high);
                quickSort(nums, low, pi - 1);
                quickSort(nums, pi + 1, high);
            }
        }

        private static int randomizedPartition(int[] nums, int low, int high) {
            int randomIndex = low + RANDOM.nextInt(high - low + 1);
            swap(nums, randomIndex, high);
            return partition(nums, low, high);
        }

        private static int partition(int[] nums, int low, int high) {
            int pivot = nums[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (nums[j] < pivot) {
                    i++;
                    swap(nums, i, j);
                }
            }
            swap(nums, i + 1, high);
            return i + 1;
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

