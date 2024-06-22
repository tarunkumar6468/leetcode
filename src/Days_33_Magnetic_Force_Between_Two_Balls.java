import java.util.Arrays;
import java.util.Scanner;

public class Days_33_Magnetic_Force_Between_Two_Balls {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public int maxDistance(int[] position, int m){
        Arrays.sort(position);
        int l = 1;
        int r = position[position.length-1]-position[0];

        while(l<r){
            final int mid = r-(r-l)/2;
            if(numBall(position,mid) >= m)
                l = mid;
            else
                r = mid -1;
        }
        return l;
    }
    private int numBall(int [] pos, int force){
        int ball = 0;
        int prePosition = -force;
        for(final int p : pos)
            if(p - prePosition >= force){
                ball++;
                prePosition = p;
            }
        return ball;
    }
}
