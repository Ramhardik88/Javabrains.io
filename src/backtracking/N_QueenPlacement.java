package backtracking;

public class N_QueenPlacement
{
    private final int N  ;

    public N_QueenPlacement(int N) {
        this.N=N;
    }

    public static void main(String[] args) {
        int n=4;
        N_QueenPlacement queen = new N_QueenPlacement(n);
        queen.queenPath();
    }

    private boolean queenPath() {
        int sol[][]=new int[N][N];

        if(!queenProblemUtil(0,sol))
        {
            System.out.println("queen placement not possible");
            return false;
        }
        printQueenpath(sol);
        return true;
    }

    private void printQueenpath(int[][] sol) {

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.println(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    private boolean queenProblemUtil(int col, int[][] sol) {
        if(col>=N)
        {
            return true;
        }

        for(int i=0;i<N;i++)
        {
            if(queensafeCondition(i,col,sol))
            {
                sol[i][col]=1;
                if(queenProblemUtil(col+1,sol))
                {
                    return true;
                }
                sol[i][col]=0;
            }
        }
        return false;

    }

    private boolean queensafeCondition(int row, int col, int[][] sol) {
        int i,j;

        for(i=0;i<col;i++)
        {
           if( sol[row][i]==1);
            return false;
        }
        for(i=row,j=col;i>=0 && j>=0;j--,i--)
        {
            if(sol[i][j]==1)
                return false;
        }
        for(i=row,j=col;i <N && j>=0;i++,j--)
        {
            if(sol[i][j]==1)
            {
                return false;
            }
        }
      return true;
    }


}
