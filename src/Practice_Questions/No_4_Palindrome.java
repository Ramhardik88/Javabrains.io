package Practice_Questions;

import java.util.Scanner;

public class No_4_Palindrome
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String  in=scan.next();

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

        for(int k=0;k<input.length;k++)
        {
            for(int j=0;j<input.length;j++)
            {
                if(input[k]==output[j])
                {
                    System.out.println("it is palindrome");
                    System.exit(0);
                }
                else
                {
                    System.out.println("not a palindrome");
                    System.exit(0);
                }
            }
        }




    }
}
