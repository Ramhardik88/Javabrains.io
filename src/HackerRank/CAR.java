package HackerRank;

import java.util.*;
import java.util.stream.Stream;

public class CAR
{
    public static void main(String[] args) {
//        char[] arr1={'r','a','m'};
//        char[] arr2={'k','u','m','a','r'};
        Scanner scan = new Scanner(System.in);
        char[]  arr1=new char[5];
        System.out.println("enter the charcter1");
        String inp1=scan.next();
        String input1=inp1.toLowerCase();
        char[] arr2=new char[5];
        System.out.println("enter the character2");
        String inp2=scan.next();
        String input2=inp2.toLowerCase();

        for(int i=0;i<input1.length();i++)
        {
            arr1[i]=input1.charAt(i);
        }
        for(int i=0;i<input2.length();i++)
        {
            arr2[i]=input2.charAt(i);
        }

        int length=arr1.length+arr2.length;

        char combine[] = new char[length];
        int pos=0;

        for(char ch:arr1)
        {
            combine[pos]=ch;
            pos++;
        }
        for(char ch:arr2)
        {
            combine[pos]=ch;
            pos++;
        }

         Arrays.sort(combine);
        Set<Character> hash = new LinkedHashSet<>();
        for(int i=0;i<combine.length;i++)
        {
            hash.add(combine[i]);

        }

        for(char ch:hash)
        {
            System.out.print(ch);
        }

    }

}
