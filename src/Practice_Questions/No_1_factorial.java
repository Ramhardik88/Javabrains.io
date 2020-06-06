package Practice_Questions;

import java.util.Scanner;

public class No_1_factorial
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to find the fctorial");
        int number=sc.nextInt();
        int fact = number;
        while (number>1)
        {
            number--;
            fact=fact*number;

        }
        System.out.println(fact);




    }


}
