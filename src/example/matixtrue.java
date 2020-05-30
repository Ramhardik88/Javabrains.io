package example;

import java.util.Scanner;

public class matixtrue
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of row");
        int row = scan.nextInt();
        System.out.print("enter the size of colmun");
        int col = scan.nextInt();

        char array[][] = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scan.next().charAt(0);
            }
        }
//
//        //change the value
//
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
               if(array[i][j]=='t')
               {

               }

            }
        }

        // print the array

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}




