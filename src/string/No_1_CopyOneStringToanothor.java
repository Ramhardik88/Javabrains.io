package string;

import java.util.Scanner;

public class No_1_CopyOneStringToanothor
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String");
        String in=scan.next();

        char input[]=in.toCharArray();
        int size=input.length;
        char output[]=new char[size];
        int i=0;
        while (i!=size)
        {
            output[i]=input[i];
            ++i;
        }
        System.out.println("the input is"+input);
        System.out.println("the output is"+output);
    }
}
