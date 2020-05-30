package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_factoer {
    public static void main(String[] args) {
        long n = 20;
        long p = 3;
        System.out.println(isSol(n, p));
    }
    private static long isSol(long n, long p) {
        long hold[]= new long[(int) (n)];
        int j = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                hold[j]=i;
                j++;
            }
        }
        if(p<j)
        {
            int index= (int) (p-1);
            return hold[index];
        }
        else
            return 0;

    }
}
