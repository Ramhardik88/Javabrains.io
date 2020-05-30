package Number;

import java.util.Scanner;

public class Circularprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();

        int temp_count=no;
        int powercount=0;
        while (temp_count>0)
        {
            temp_count/=10;
            powercount++;
        }
        System.out.println("the count of the digits "+powercount);

      int c_prime=no;
        int count = 0;

        while (  isPrime(c_prime))
        {
            count++;
            int rem=c_prime%10;
            int num=c_prime/10;
           c_prime= (int) (Math.pow(10,powercount-1)*rem)+num;
           if(c_prime==no)
           {
               break;
           }
        }
        if(count==powercount)
        {
            System.out.println(no+"the circular prime");
        }
        else
        {
            System.out.println(no+" not a circular prime");
        }
    }

    private static boolean isPrime(int no) {
        boolean flag=false;

        int i=2;
        while (i<no)
        {
            if(no%i==0)
            {
                flag=false;
                break;
            }
            i++;
        }
        if(!flag)
        {
            return true;
        }

        return flag;
    }
}
