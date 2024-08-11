import java.util.PriorityQueue;

public class Days_44_Mice_and_Cheese {
    public static int maxPoints(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;

        // Priority queue to store the differences in descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        // Calculate the initial points if second mouse eats all the cheese
        int totalPoints = 0;
        for (int i = 0; i < n; i++) {
            totalPoints += reward2[i];
        }

        // Calculate the differences and add them to the priority queue
        for (int i = 0; i < n; i++) {
            pq.add(reward1[i] - reward2[i]);
        }

        // Add the top k differences to the total points
        for (int i = 0; i < k; i++) {
            totalPoints += pq.poll();
        }

        return totalPoints;
    }

    public static void main(String[] args) {
        int[] reward1 = {1, 4, 4, 6};
        int[] reward2 = {2, 3, 6, 7};
        int k = 2;

        System.out.println("Maximum points: " + maxPoints(reward1, reward2, k));
    }
}
