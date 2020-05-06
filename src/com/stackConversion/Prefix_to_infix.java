package com.stackConversion;

import java.util.Stack;

public class Prefix_to_infix {
    public static void main(String args[])
    {
        String prefix="/*-+abc^d^efg";

        System.out.println("the infix String"+prefix_to_infix(prefix));
    }

    private static String prefix_to_infix(String prefix) {

        Stack<String> stack=new Stack<>();

        for(int i=prefix.length()-1;i>=0;i--)
        {
            if(isOperand(prefix.charAt(i)))
            {
                stack.push(prefix.charAt(i)+" ");
            }
            else
            {
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();

                stack.push("("+ op1+ prefix.charAt(i)+ op2+")");
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
