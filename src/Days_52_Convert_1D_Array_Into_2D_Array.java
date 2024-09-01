import java.util.Scanner;

public class Days_52_Convert_1D_Array_Into_2D_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Math.max(m,n);
            int original[] = new int[max];

        for(int i = 0; i<max; i++){
            original[i]= sc.nextInt();
        }
        int [][] ans = convert(original,m,n);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.println(ans[i][i]);
            }
        }

    }
    public static int[][] convert(int[]original, int m, int n){
        int [][]dp = new int[m][n];
        if(m*n!=original.length)return new int[0][0];
        int idx = 0;
        for(int i = 0; i<m; i++){
            for (int j = 0; j < n; j++) {
                dp[i][j] = original[idx];
                idx++;
            }
        }
        return dp;
    }
}
