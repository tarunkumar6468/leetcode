public class Days25_String_Reverse {
    public static void main(String[] arsg){
        char []s = {'H','e','l','l','o'};
            StringReverse_Fun(s);
        System.out.println(s);
    }
    public static void StringReverse_Fun(char[] s){
       int i = 0;
       int j = s.length-1;
       while(i<j){
           char temp = s[i];
           s[i] = s[j];
           s[j] = temp;
           i++;
           j--;
       }
    }
}
