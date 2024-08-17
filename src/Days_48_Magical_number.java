import java.util.Scanner;

public class Days_48_Magical_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = magicalNumber(n);
         System.out.println(ans);
//        String s = Integer.toBinaryString(n);
//        System.out.println(s);

    }

    public static int magicalNumber(int n) {

        int finalAns = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == '0') {
                    sb.append("1");
                } else {
                    sb.append("2");
                }
            }
                String str = sb.toString();

                int n1 = Integer.parseInt(str);
                int count = 0;


                while (n1 != 0) {
                    int anss = n1 % 10;
                    count += anss;
                    n1 /= 10;
                }
                if (count % 2 == 1 ) {
                finalAns++;
            }
        }

        return finalAns;

    }
}
