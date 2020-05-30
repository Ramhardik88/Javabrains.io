package Number;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to check the prime");
        int no = sc.nextInt();



        int i = 2;
        while (i < no) {
            if (no % i == 0) {
                break;
            }
            i++;
        }
        if(i!=no/2+1)
        {
            System.out.println(no+"true");
        }
        else
        {
            System.out.println("false");
        }

   }


    }



