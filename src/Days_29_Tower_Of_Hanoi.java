import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Days_29_Tower_Of_Hanoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char source ='a';
        char auxiliary = 'b';
        char destination = 'c';

        solveTowerOfHanoi(n,source,auxiliary,destination);

    }
    public static void solveTowerOfHanoi(int n, char source,char auxiliary, char destination){
        if(n == 1){
            System.out.println("Move disk from ("+ source +") to ("+destination+")");
        return;
        }
        solveTowerOfHanoi(n-1, source,auxiliary,destination);
        System.out.println("move disk ("+n+") from ("+source+") to ("+destination+")");
        solveTowerOfHanoi(n-1,auxiliary,source,destination);
    }
}
