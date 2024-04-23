import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day17_Add_to_Array_Form_of_Integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

System.out.println(addToArrayForm(arr,k));
    }
    public static  List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>list = new ArrayList<>();
        for(int i = num.length-1; i >=0;i--){
            list.add(0,(num[i]+k)%10);
            k = (num[i]+k)/10;
        }
        while(k>0){
            list.add(0,k%10);
            k = k/10;
        }
        return list;
    }
}
