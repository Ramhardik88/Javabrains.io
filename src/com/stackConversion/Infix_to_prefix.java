package com.stackConversion;

public class Infix_to_prefix {

    public static char main(String []args)
    {
        String input="((a+b-c)*d^e^f)/g";
        String reverse=new StringBuilder(input).reverse().toString();
        for(int i=0;i<reverse.length();i++)
        {
            if(reverse.charAt(i)=='(')
            {
                return ')';
            }
            else
            {

            }
        }

        System.out.println(reverse);

//        System.out.println("Infix Expression"+input);
//
//        System.out.println("Prefix Expression"+infix_to_prefix(input));
        return 0;
    }

//    private static String infix_to_prefix(String input) {
//
//    }
//
//    private static boolean isOperator(char c) {
//
//        if(c=='+'||c=='-'||c=='*'||c=='/'|| c=='^')
//        {
//            return true;
//        }
//        else {
//            return false;
//        }
//
//    }
//
//
//    private static int precedence(char c) {
//        if(c=='^')
//        {
//            return 3;
//        }
//        else if(c=='*'||c=='/')
//        {
//            return 2;
//        }
//        else if(c=='+'|| c=='-')
//        {
//            return 1;
//        }
//        else
//        {
//            return -1;
//        }
//
//
//    }
//
}

