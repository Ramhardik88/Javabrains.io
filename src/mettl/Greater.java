package mettl;

import java.util.Scanner;
//Write a program to accept two numbers and print the greater value of the two
public class Greater
{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter the number1");
        int number1=scan.nextInt();
        System.out.println("enter the number2");
        int number2=scan.nextInt();

        if(number1>number2)
        {
            System.out.println(number1);
        }
        else if(number2>number1)
        {
            System.out.println("number 2"+number2);
        }


    }
}
