package mettl;

import java.util.Scanner;

public class isEven
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println(isSolution(number));
    }

    private static int isSolution(int number) {
        if(number%2!=0 && number==0)
        {
            return 2;
        }
        else
            return 1;
    }
}
