import java.util.Scanner;

public class Days_53_Find_the_Student_that_Will_Replace_the_Chalk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []chalk = new int[n];
        for(int i = 0; i<n;i++){
            chalk[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = chalkReplace(chalk,k);
        System.out.println(ans);

    }
    public static  int chalkReplace(int []chalk, int k){
        int len = chalk.length;
        long sum[] = new long[len];
        sum[0] = chalk[0];
        for(int i=1;i<len;i++){
            sum[i]=chalk[i]+sum[i-1];
        }
        k = (int)(k%sum[len-1]);

        int i=0, j=len-1;
        while(i<j){
            int mid = (i + j) / 2;
            if (sum[mid] > k) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}

