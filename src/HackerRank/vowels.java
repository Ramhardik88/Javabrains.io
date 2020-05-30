package HackerRank;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to find the vowels");
        String input = scan.next();
        input=input.trim();
        char cha[]=input.toCharArray();

        Set<Character> set=new TreeSet<>();
         for(int i=0;i<cha.length;i++)
         {
             set.add(cha[i]);
         }

         for(char out:set)
         {
             if(out=='a'|| out=='e'|| out=='i'||out=='o'||out=='u')
             {
                 System.out.print(out);

             }

         }



    }
}

