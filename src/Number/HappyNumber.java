package Number;

public class HappyNumber 
{
    public static void main(String[] args) {
        int num=19;
        System.out.println(isSOl(num));
    }

    private static boolean isSOl(int num) {
        int slow=num,fast=num;

        while (true)
        {
            slow=getintvalue(num);
            fast=getintvalue(num);
            fast=getintvalue(num);

            if(fast==slow)
                break;
        }
        return slow==1;


    }

    private static int getintvalue(int num) {
        int square=0;
        while (num>0)
        {
           int t=num%10;
            square=square+t*t;
            num=num/10;
        }
        return square;
    }
}
