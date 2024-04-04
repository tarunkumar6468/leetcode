import java.util.Scanner;

public class Day6_find_the_pivot_integer {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    //int ans = pivot(n);
  //  System.out.println(ans);


    int ans = pivotSecond(n);
    System.out.println(ans);
}
public static int pivot(int n){
    final int y = (n * n + n) / 2;
    final int x = (int) Math.sqrt(y);
    return x * x == y ? x : -1;
}
public static int pivotSecond(int n){
    int ls = 0;
    int rs = n*(n+1)/2;

    for(int i = 1 ;i<=n; i++){
        ls+=i;
        rs-=i-1;
        if(ls == rs){
            return i;
        }


    }
    return -1;
}
}
