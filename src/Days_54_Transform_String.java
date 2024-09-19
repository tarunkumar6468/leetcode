import java.util.Scanner;

public class Days_54_Transform_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int ans = updateString(a,b);
        System.out.println(ans);

    }
    public static int  updateString(String a, String b){
        int n = a.length();
        int m = b.length();
        int s1 = 0;
        int s2 = 0;
        if(m!=n){
            return -1;
        }

        for(int i = 0; i<n;i++){
            s1+=a.charAt(i);
        }
        for(int i = 0; i<m; i++){
            s2+=b.charAt(i);
        }
        if(s2!=s1){
            return -1;
        }
        int i = n-1, j=m-1 , c=0;
        while (i>=0 && j>=0){
            if(a.charAt(i)==b.charAt(j)){
                i--;
                j--;
            }
            else {
                c++;
                i--;
            }
        }
        return c;
    }
}
