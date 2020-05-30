package mettl;

public class SumOFlastDigit
{
    public static void main(String[] args) {


        int input1 = -345;
        int input2 = -567;
        System.out.println(isSolution(input1,input2));
    }

    private static int isSolution(int input1, int input2) {
         int num1=input1%10;
         if(input1<0)
         {
             num1=Math.abs(input1%10);
         }

        int num2=input2%10;
        if(input1<0)
        {
            num2=Math.abs(input2%10);
        }
         return num1+num2;
    }
}
