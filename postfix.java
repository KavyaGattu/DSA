
import java.util.Stack;

public class postfix {
    public static int postfixevel(String expression){
              Stack<Integer>stack=new Stack<>();
              for(int i=0;i<expression.length();i++){
                char ch=expression.charAt(i);
                if(ch==' ')
                {
                    continue;
                }
                if(Character.isDigit(ch))
                {
                    stack.push(ch-'0');
                }
                else{
                   int  operand2=stack.pop();
                   int operand1=stack.pop();
                }
              }

    }
    
}
