package Leetcode;

public class Number_Of_Islands
{
    public static void main(String []args){
String[][]  s=  {{"1","1","1","1","0"}
                ,{"1","1","0","1","0"}
                ,{"1","1","0","0","0"}
                ,{"0","0","0","0","0"}};
    }
    public static int numIslands(char[][] grid) {
        int count=0;
         for(int i=0;i<grid.length;i++){
             for (int j=0;j<grid[0].length;j++){

                 if(grid[i][j]=='1'){
                     countIsHelper(grid,i,j);
                     count++;

                 }
             }
         }

        return count;
    }

    private static void countIsHelper(char[][] grid, int i, int j) {
        if(i<0 || j<0 || i>=grid.length ||j>= grid[0].length || grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';
        countIsHelper(grid,i+1,j);
        countIsHelper(grid,i-1,j);
        countIsHelper(grid,i,j+1);
        countIsHelper(grid,i,j-1);



    }


}
