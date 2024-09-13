import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res=new StringBuilder("");
        while(!s.isEmpty()){
            char c=s.pop();
            res.append(c);
        }
        str=res.toString();
        return str;
    }
    public static void main(String[] args) {
      
        String str="abc";
        System.out.println(reverse(str));
    }
}
