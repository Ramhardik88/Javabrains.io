package HackerRank;


import java.util.*;

public class CharacterArrayString {
    public static void main(String[] args) {
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

        Set<Character>  set1= new LinkedHashSet<>();
        Set<Character>  set2=new LinkedHashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            set1.add(new Character(arr1[i]));
        }

        for(int i=0;i<arr2.length;i++)
        {
            set2.add(new Character(arr2[i]));
        }

        Set<Character>  join= new TreeSet<>();
        join.addAll(set1);
        join.addAll(set2);

        for(char out:join)
        {
            System.out.print(out);
        }





    }

}



