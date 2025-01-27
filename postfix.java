public class postfix{
    
   static int  evaluator(String expression)
    {
        
        int top=-1;
        int maxsize=expression.length();
        int stack[]=new int[maxsize];
        for(int i=0;i<expression.length();i++)
        {    
            char ch=expression.charAt(i);
            if(Character.isDigit(ch))
            {
                top++;
                stack[top]=(ch-'0');
            }
            else
            {
                int op2=stack[top--];
                int op1=stack[top--];
        
        switch(ch)
        {
            case '+':
              stack[++top]=op1+op2;
              break;
              case '-':
                  stack[++top]=op1-op2;
                  break;
                  case '*':
                  stack[++top]=op1*op2;
                  break;
                  case '/':
                      stack[++top]=op1/op2;
                      break;
        }
    }
    }
    return stack[top];
}

public static void main(String args[])
{
    String expression="231*+9-";
    int result=postfix.evaluator(expression);
    System.out.println("The result is:"+result);
}
} 


