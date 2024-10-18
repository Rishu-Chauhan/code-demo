import java.util.*;
public class InfixToPostfix {
    public static String PostfixConversion(String s,int n){
        int i=0;
      Stack<Character> st=new Stack<>();
      StringBuilder ans=new StringBuilder();
      while(i<n){
        if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
            ans.append(s.charAt(i));
        }
        else if(s.charAt(i)=='('){
            st.push(s.charAt(i));
        }
        else if(s.charAt(i)==')'){
            while(!st.isEmpty() && st.peek()!='('){
                ans.append(st.peek());
                st.pop();
            }
            st.pop();
        }
        else{
            while(!st.isEmpty() && priority(s.charAt(i))<=priority(st.peek())){
              ans.append(st.peek());
              st.pop();
            }
            st.push(s.charAt(i));
        }
        i++;
      }  
      while(!st.isEmpty()){
        ans.append(st.pop());
      }
      return ans.toString();
    }
    public static int priority(char ch){
        if(ch=='^'){
            return 3;
        }
       else if(ch=='/' || ch=='*'){
            return 2;
        }
       else if(ch=='+' || ch=='-'){
         return 1;
        }
        else{
            return -1;
        }
      
    }
    public static void main(String[] args) {
        String s="a+b*(c^d-e)";
        int n=s.length();
      System.out.println(  PostfixConversion(s, n));
    }
}
