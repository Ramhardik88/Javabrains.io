package backtracking;

public class RatMazeProblem
{
   final int N=4;
    public boolean printmazePath(int[][] maze)
    {
        int [][] finalpath=new int[N][N];

        if(!printMazePathUtil(maze,0,0,finalpath))
        {
            System.out.println("Rat can't  reach to end");
            return true;
        }
        printpath(finalpath);
        {
            return true;
        }

    }

    private void printpath(int[][] finalpath) {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(finalpath[i][j]+" ");
            }
            System.out.println();
        }
    }

    private boolean printMazePathUtil(int[][] maze, int x, int y, int[][] sol) {
        if( x==N-1 && y==N-1 && maze[x][y]==1 )
        {
            sol[x][y]=1;
            return true;
        }
        if(isSafe(maze,x,y))
        {
            sol[x][y]=1;
            if(printMazePathUtil(maze,x+1,y,sol))
            {
                return true;
            }
            if(printMazePathUtil(maze,x,y+1,sol))
            {
                return true;
            }
            sol[x][y]=0;
        }
        return false;
    }

    private boolean isSafe(int[][] maze, int x, int y) {
        if(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1)
        {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        RatMazeProblem rat=new RatMazeProblem();

        int maze[][]={  {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,1},
                        {1,0,0,1}};
        rat.printmazePath(maze);

    }

}
