import java.util.Arrays;
import java.util.Scanner;

public class Days_55_179_Largest_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []num = new int[n];
        for(int i = 0; i<n; i++){
            num[i]=sc.nextInt();
        }
        String ans = largest(num);
        System.out.println(ans);

    }
    public static String largest(int [] num){
        String[] array =  new String[num.length];
        for(int i=0; i<num.length; i++){
            array[i] = String.valueOf(num[i]);
        }
        Arrays.sort(array,(a, b)-> (b+a).compareTo(a+b));
        if(array[0].equals("0")){
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(int i=0; i<array.length; i++){
            largest.append(array[i]);
        }
        return largest.toString();
    }
    public static boolean maximum(int x, int y){
        return x+y>y+x;

    }
}
