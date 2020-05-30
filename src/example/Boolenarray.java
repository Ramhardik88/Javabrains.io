package example;

import java.util.Scanner;

public class Boolenarray {
    public static void main(String[] args) {
//        boolean[][] array = {{true, false, true},
//                {false, true, false}};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the sizeof row");
        int row=scan.nextInt();
        System.out.println("enter the size of column");
        int column=scan.nextInt();
        Boolean array[][]=new Boolean[row][column];

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                Boolean b= scan.nextBoolean();
                array[i][j]=b;
            }
        }



        int rows_length = array.length;
        int columns_length = array[0].length;

        for (int i = 0; i < rows_length; i++) {
            for (int j = 0; j < columns_length; j++) {

                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }

            }
            System.out.println();
        }

    }

}
