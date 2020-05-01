package io.stackConversion;

import java.util.Stack;

public class PostFix_to_Infix
{
    public static void main(String args[])
    {
        String post="ab+c-def^^*g/";

     System.out.println(   postfix_to_infix(post));
    }

    private static String postfix_to_infix(String postfix) {
           Stack<String> stack= new Stack<>();

        for(int i=0;i<postfix.length();i++)
        {
            if(isOperand(postfix.charAt(i)))
            {
                stack.push(postfix.charAt(i)+" ");
            }
            else{
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();

                stack.push("(" + op2 + postfix.charAt(i) + op1 +")");
            }

        }
      return stack.peek();
    }



    private static boolean isOperand(char c) {
        if((c>='a' && c<='z')||(c>='A' && c<='Z'))
        {
            return true;
        }
        else {
            return false;
        }
    }

}
