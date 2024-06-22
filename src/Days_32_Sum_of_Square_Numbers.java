public class Days_32_Sum_of_Square_Numbers {
    public static void main(String[] args){
        int c = 6;
        System.out.println( judgeSquareSum(c));
    }
    public static boolean judgeSquareSum(int c){
        if (c<0)return false;
        int a = 0;
        int b = c;

        while(a<=b){
            int sum = a*a+b*b;
            if(sum==c)return true;
            else if(sum<c){
                a++;
            }
            else {
                b--;
            }
        }
        return false;
    }
}
