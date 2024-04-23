import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Days18_single_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fun1 = findNumber(arr);
        System.out.println(fun1);
        System.out.println();
        int fun2 = usingBit(arr);
        System.out.println(fun2);

    }

    public static int findNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                set.remove(num);
            }
        }
        for (int uniqueNum : set) {
            return uniqueNum;
        }
        return  0;
    }
    public  static  int usingBit(int [] nums){
        int res = 0;
        for(int i : nums){
            res ^=i;
        }
        return res;
    }
}

