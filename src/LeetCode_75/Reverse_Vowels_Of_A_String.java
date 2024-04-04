package LeetCode_75;

import java.util.Scanner;

public class Reverse_Vowels_Of_A_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = reverseVowels(s);
        System.out.println(ans);
    }
    public static  String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        String v = "aeiouAEIOU";
        int i= 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && v.indexOf(ch[i])==-1){
                i++;
            }
            while(i<j && v.indexOf(ch[j])==-1){
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String string = new String(ch);
        return string;
    }
}
