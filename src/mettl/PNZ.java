package mettl;
//Write a program to accept a number N and print whether it is positive, negative or zero

import java.util.Scanner;

public class PNZ {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=Scan.nextInt();

        if(number>0)
        {
            System.out.println("it is positive");
        }
         else if(number==0)
        {
            System.out.println("zero");
        }
        else if(number<0)
         {
             System.out.println("It is negative");
         }

    }
}
