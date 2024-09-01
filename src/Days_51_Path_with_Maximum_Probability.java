import java.util.Scanner;

public class Days_51_Path_with_Maximum_Probability {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]edges  = new int[n][];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                edges[i][j] = sc.nextInt();
            }
        }

        double []succProb = new double[n];
        for(int j = 0; j<n; j++){
            succProb[j] = sc.nextInt();
        }
        int start_node = sc.nextInt();
        int end_node = sc.nextInt();

        double ans = maxProbability(n,edges,succProb,start_node,end_node);
        

    }
    public static double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] probs = new double[n];
        probs[start_node] = 1;
        for(int i = 0; i < n - 1; i++) {
            boolean change = false;
            for(int j = 0; j < edges.length; j++) {
                int src = edges[j][0];
                int dest = edges[j][1];
                double prob = succProb[j];

                if(probs[src] * prob > probs[dest]) {
                    probs[dest] = probs[src] * prob;
                    change = true;
                }
                if(probs[dest] * prob > probs[src]) {
                    probs[src] = probs[dest] * prob;
                    change = true;
                }
            }
            if(change == false) break;
        }
        return probs[end_node];
    }
}
