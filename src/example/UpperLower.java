package example;

import java.util.Scanner;

public class UpperLower
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter the string");
        String input=Sc.next();//

        String s1="";
        String s2="";

        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                s1+=ch;
            }
            else
            {
                s2+=ch;
            }
        }

        System.out.println(s1+" "+s2);


    }
}
