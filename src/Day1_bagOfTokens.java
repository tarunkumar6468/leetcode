import java.util.Arrays;
import java.util.Scanner;

public class Day1_bagOfTokens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tokens[] = new int[n];
        int power = sc.nextInt();
        for(int i = 0; i<n; i++){
            tokens[i] = sc.nextInt();
        }
        int ans  = bagOfTokensScore(tokens,n,power);
        System.out.println(ans);
    }
    public static int bagOfTokensScore(int arr[] , int n, int p){
        int count = 0;
        if(arr[0]>p)return 0;
        Arrays.sort(arr);
        for(int i = 0; i<n;i++){
            if(p<=arr[i]){
                p-=arr[i];

                count++;
            }
            else if(count==1){
                p = p + arr[n-1];
                count--;
            }
        }
        return count;
    }
}
