import java.util.Stack;

public class Days_42_Reverse_Substrings_Between_Each_Pair_of_Parentheses {
    public static void main(String[] args){
        String s = "(u(love)i)";
        String ans = reverseParentheses(s);
        System.out.println(ans);

    }
    public static  String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder res = new StringBuilder()
                ;    int arr[] = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else if(ch == ')'){
                int OInd = st.pop();
                arr[OInd] = i;
                arr[i] = OInd;
            }
        }
        int dir = 1;
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch=='(' || ch == ')'){
                i = arr[i];
                dir = -1*dir;
            }
            else{
                res.append(ch);
            }
            i+=dir;
        }
        return res.toString();
    }
}
