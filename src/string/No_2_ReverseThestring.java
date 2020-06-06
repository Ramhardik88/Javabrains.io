package string;

import java.util.Scanner;

public class No_2_ReverseThestring
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String in=scan.next();

        char input[]= in.toCharArray();
        int size=input.length;
        char output[]=new char[size];
        int i=0;
        while (i!=size)
        {
            output[size-1-i]=input[i];
            i++;
        }
        System.out.println(input);
        System.out.println(output);
    }
}
