package Practice_Questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class No_3_DiffBetween2dig
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int number= scan.nextInt();

        int num1=number%10;
        int num2=number/10;

        int result= num1-num2;
        System.out.println(result);

    }

}
