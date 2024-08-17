import java.util.Scanner;

public class Days_49_Count_Uniqu_Digits {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = countUniDigits(n);
        System.out.println(ans);
    }
    public static int countUniDigits(int n){
        int res = 0;
        int count[] = {0,0,0,0,0,
                        0,0,0,0,0};
        while (n>0){
            int rem = n%10;
            count[rem]++;
            n = n/10;
        }
        for (int i = 0; i<count.length; i++){
            if(count[i]==1){
                res++;
            }

        }
        return res;
    }
}
