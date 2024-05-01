import java.util.Scanner;

public class Days19_reverse_prefix_of_the_word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char ch = sc.next().charAt(0);

        String ans  = reverseString(word,ch);
        System.out.println(ans);

    }
    public static String reverseString(String word,char ch){
        StringBuilder sb = new StringBuilder();
        int  count = 0;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);

            if(ch!=c || (ch == c && count == 1)){
                sb.append(c);
            }
            else if(ch==c && count==0){
                sb.append(c);
                count++;
                sb.reverse();

            }

        }
        return sb.toString();
    }
}
