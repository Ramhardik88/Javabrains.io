package Leetcode;

public class Minimumpathsum
{
    public static void main(String[]args) {


        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},};
        System.err.println(minPathsum(grid));

    }

    private static int minPathsum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        System.err.println(col);


        int[][] dp=new int[row][col];// declare the array
        dp[0][0]=grid[0][0];//initial the array

        for(int i=1;i<row;i++)    //condition for row
        {
           dp[i][0]= grid[i][0]+dp[i-1][0];
        }
        for(int i=1;i<col;i++)       // condition for col
        {
            dp[0][i]=grid[0][i]+dp[0][i-1];
        }

        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
       return dp[row-1][col-1];
    }
}
