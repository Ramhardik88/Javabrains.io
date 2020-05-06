package com.stackConversion;

import java.util.Stack;

public class Infix_to_postfix
{
    public static void main(String []args)
    {
        String s="A+B*(C^D-E)";

        System.out.println("The infix Expression  "+s);

        char[] infix=s.toCharArray();

        Stack<Character>stack=new Stack<>();
       String result=infix_to_postfix(infix,stack);
       System.out.println("The postfix Expression  "+result);

    }

    private static String infix_to_postfix(char[] infix, Stack<Character> stack) {
        String postfix ="";

        for(int i=0;i<infix.length;i++)
        {
            if((infix[i]>='a' && infix[i]<='z') || (infix[i]>='A' && infix[i]<='Z'))
            {
                postfix+=infix[i];
            }

            else if(infix[i]=='(')
            {
                stack.push(infix[i]);
            }
            else if(infix[i]==')')
            {
                while ((stack.peek()!='(') &&  (!stack.isEmpty()))
                {
                    char temp=stack.peek();
                    postfix+=temp;
                    stack.pop();
                }

                if(stack.peek()=='(')
                {
                    stack.pop();
                }
            }
            else if(isOperator(infix[i]))
            {
                if(stack.isEmpty())
                {
                    stack.push(infix[i]);
                }
                else
                {
                    if(precedence(infix[i])>precedence(stack.peek()))
                    {
                        stack.push(infix[i]);
                    }
                    else  if((precedence(infix[i])==precedence(stack.peek()))&& (infix[i]=='^'))
                    {
                        stack.push(infix[i]);
                    }
                    else
                    {
                        while( (!stack.isEmpty())&& (precedence(infix[i])<=precedence(stack.peek())))
                         {
                             postfix+=stack.peek();
                             stack.pop();
                        }
                        stack.push(infix[i]);
                    }
                }

            }

        }
        //to print the last element int stack
        while (!stack.isEmpty())
        {
            postfix+=stack.peek();
            stack.pop();
        }

        return postfix;
    }

    private static boolean isOperator(char c) {

        if(c=='+'||c=='-'||c=='*'||c=='/'|| c=='^')
        {
            return true;
        }
        else {
            return false;
        }

    }


    private static int precedence(char c) {
        if(c=='^')
        {
            return 3;
        }
        else if(c=='*'||c=='/')
        {
            return 2;
        }
        else if(c=='+'|| c=='-')
        {
            return 1;
        }
        else
            {
            return -1;
        }


    }


}
