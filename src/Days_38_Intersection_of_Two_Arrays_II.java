import java.util.ArrayList;
import java.util.HashMap;

public class Days_38_Intersection_of_Two_Arrays_II {
    public static void main(String[] args){
        int arr1 [] = {1,2,2,3};
        int arr2 [] = {2,2};
        int ans[] = findIntersections(arr1,arr2);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]);
        }
        System.out.println();
        int ans1[] = findIntersections(arr1,arr2);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans1[i]);
        }

    }
    public static int[]  findIntersections(int []nums1,int [] nums2){

        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }

        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
    public static int[] findIntersections1(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Count occurrences of each element in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find intersections with nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert the list to an array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
