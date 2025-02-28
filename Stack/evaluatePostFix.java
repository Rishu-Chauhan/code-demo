import java.util.Stack;

public class evaluatePostFix {
   public static int evaluate(String[] s){
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<s.length;i++){
        if (s[i].matches("\\d+")) {
            st.push(Integer.parseInt(s[i]));
         }
        else{
            if(st.size()<2){
                return Integer.MIN_VALUE;
            }
            int op2=st.peek();
            st.pop();
            int op1=st.peek();
            st.pop();

            switch (s[i]) {
             case "+":
                   st.push(op1+op2);
                    break;
              case "-":
                    st.push(op1-op2);
                     break;
              case "*":
                     st.push(op1*op2);
                      break;
               case "/":
                      st.push(op1/op2);
                       break;

                case "^":
                       st.push((int)Math.pow(op1,op2));
                        break;
            }
        }
    
    } 
    if(st.isEmpty()){
        return Integer.MIN_VALUE;
    }
    return st.peek();
   }
    public static void main(String[] args) {
       String[] s = { "2","1","+","3","*"};
        System.out.println(evaluate(s));
    }
}
