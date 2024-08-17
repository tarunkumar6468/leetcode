import java.util.Scanner;

public class Days_47_Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
         arr[i]  = sc.nextInt();
        }
        var ans = maximumProfit(arr);
        System.out.println(ans);
}
public static int maximumProfit(int prices[]){
    if (prices.length == 0) return 0;  // Handle edge case if the array is empty

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;  // Update minPrice
        } else {
            int profit = price - minPrice;  // Calculate current profit
            if (profit > maxProfit) {
                maxProfit = profit;  // Update maxProfit if the current profit is higher
            }
        }
    }

    return maxProfit;
}

}
