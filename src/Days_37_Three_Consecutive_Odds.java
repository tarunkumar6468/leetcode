import java.util.Scanner;

public class Days_37_Three_Consecutive_Odds {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i<n; i++){
          arr[i] = sc.nextInt();
      }
      System.out.println(threeConsecutiveOdds(arr));
  }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==1){
                count++;
                if(count==3)return true;
            }
            else{
                count=0;
            }
        }
        return false;
    }
}
