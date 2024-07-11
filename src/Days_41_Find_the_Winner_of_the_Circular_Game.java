import java.net.Inet4Address;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Days_41_Find_the_Winner_of_the_Circular_Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // Read the skip count
        int k = sc.nextInt();

        // Find the winner
        int winner = findTheWinner(n, k);
        System.out.println(winner);

    }
    public static int findTheWinner(int n, int k) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deq.add(i);
        }
        while (deq.size() > 1) {
            for (int j = 1; j < k; j++) {
                deq.add(deq.remove());
            }
            deq.remove();
        }
        return deq.peek();
    }
    }
