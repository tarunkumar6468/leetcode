import java.util.Scanner;

public class Days_40_Pass_the_Pillow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();

        int ans = peopleWithPillow(n, time);
        System.out.println(ans);
    }
    public static int peopleWithPillow(int n,  int time){

        time %= (n - 1) * 2;
        if (time < n) // Go forward from 1.
            return 1 + time;
        return n - (time - (n - 1));

    }
}
