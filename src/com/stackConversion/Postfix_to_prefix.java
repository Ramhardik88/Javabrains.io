package com.stackConversion;

import java.util.Stack;

public class Postfix_to_prefix
{
    public static void main(String []args)
    {
        String postfix="ab+c-def^^*g/";
        System.out.println("the prefix expression "+postif_to_prefix(postfix));

    }

    private static String postif_to_prefix(String postfix) {

        Stack<String> stack= new Stack<>();

        for(int i=0;i<postfix.length();i++)
        {
            if(isOperand(postfix.charAt(i)))
            {
                stack.push(postfix.charAt(i)+"");
            }
            else {
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();

                stack.push(postfix.charAt(i)+op2+op1);

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
