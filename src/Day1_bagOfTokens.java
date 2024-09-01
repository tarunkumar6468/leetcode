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
        int res=0;
        Arrays.sort(arr);
        int l = 0;
        int r = n-1;
        while(l<=r){
            if(p>=arr[l]){
                p-=arr[l];
                l++;
                count++;
                res = Math.max(res,count);
            }
            else if(count>0){
                p = p + arr[r];
                r--;
                count--;

            }
            else{
                break;
            }

        }
        return res;
    }
}

