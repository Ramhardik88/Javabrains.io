package mettl;

public class LastDigits
{
    public static void main(String[] args) {
        int num=3;
       // System.out.println(isSOl(num));
        System.out.println(isSolSecond(num));
    }

    private static int isSolSecond(int num) {
        int a = Math.abs(num % 100) / 10;

        if (num <10 &&num == num % 100)
        {
            return -1;
        }
        return a;
        }


    private static int isSOl(int num) {

        int a=num%10;
        if(num<0)
        {
             a=( Math.abs(num)%10);
        }

        return a;
    }
}
