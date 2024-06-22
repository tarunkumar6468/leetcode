import java.util.Arrays;

public class Days_31_Minimum_Number_of_Moves_to_Seat_Everyone {
    public static void main(String[] args){
        int []seats = {3,1,5};
        int []students = {2,7,4};
        int ans = checkMinimumMoves(seats,students);


        System.out.println(ans);
    }
    public static int  checkMinimumMoves(int [] seats, int[] students){
        int sum=0;
        int diff=0;
        int n=seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++)
        {
            diff=(int)Math.abs(students[i]-seats[i]);
            sum+=diff;

        }
        return sum;
    }

}
