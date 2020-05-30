package string;

public class ReverseString
{
    public static void main(String[] args) {
        String str="hello";
        System.out.println(isSol(str));



        }


    private static String isSol(String str) {
        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
    }
        return sb.toString();
}}
