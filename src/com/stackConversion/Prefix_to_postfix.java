package com.stackConversion;

import java.util.Stack;

public class Prefix_to_postfix
{
    public static void main(String []args){
        String prefix="/*-+abc^d^efg";
        System.out.println("The postfix Expression --> "+prefix_to_postfix(prefix));
    }

    private static String prefix_to_postfix(String prefix) {
        Stack<String> stack=new Stack<>();

        for(int i=prefix.length()-1;i>=0;i--)
        {
            if(isOperand(prefix.charAt(i)))
            {
                stack.push(prefix.charAt(i)+"");
            }
            else {
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();

                stack.push(op1+op2+prefix.charAt(i));
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
