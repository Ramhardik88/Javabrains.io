package mettl;
//Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0

public class backword
{
    public static void main(String[] args) {
        for(int i=100;i>=0;i-=3)
        {
            System.out.print(i+" ");
        }

    }
}
