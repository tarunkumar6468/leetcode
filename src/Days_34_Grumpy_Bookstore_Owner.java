import java.util.Arrays;
import java.util.Scanner;

public class Days_34_Grumpy_Bookstore_Owner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int []customer = new int[n];
        for(int i = 0; i<n; i++){
            customer[i] = sc.nextInt();

        }
        int []grumpy  = new int[m];
        for(var i : grumpy){
            grumpy[i] = sc.nextInt();
        }
        int minutes = sc.nextInt();

        int ans = maxSatisfied(customer,grumpy,minutes);
        System.out.println(ans);
    }
    public static int maxSatisfied(int []customer, int [] grumpy, int minutes) {
        int n = customer.length;

        int maxSatisfied = 0;
        int currSatisfied = 0;
        for (int i = 0; i < minutes; i++) {
            currSatisfied += customer[i] * grumpy[i];
        }
        maxSatisfied = currSatisfied;

        int i = 0;
        int j = minutes;
        while (j < n) {
            currSatisfied += customer[j] * grumpy[j];
            currSatisfied -= customer[i] * grumpy[i];
            maxSatisfied = Math.max(maxSatisfied, currSatisfied);
            i++;
            j++;
        }

        int total = maxSatisfied;
        for(int  k = 0; k<n; k++){
            total+=customer[k]*(1-grumpy[k]);
        }
        return total;
    }
}
