package Practice_Questions;

import java.util.*;

public class No_2_StringRem
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string ");
        String s=scan.next();

        char chars[]=s.toCharArray();
        Set<Character> set= new LinkedHashSet<>();
        for(char i:chars)
        {
            set.add(i);
        }

        StringBuilder sb= new StringBuilder();
        for(Character ch: set)
        {
            sb.append(ch);
        }
        System.out.println(sb);

    }
}
