package example;

import java.util.Scanner;

public class deciaml {
    public static void main(String[] args) {

        int num = 15;
        String x="";
        int a;
        int count=0;

        while (num>0)
        {
            a=num%2;
            if(a==0)
            {
                count++;
            }
            x=a+""+ x;
            num=num/2;
        }
        System.out.println(x);
        System.out.println(count);
    }

}
