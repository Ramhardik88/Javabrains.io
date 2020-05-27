package Leetcode_may;

public class Day_10_FindJudge
{
    public static void main(String[] args) {
        int trust[][]={{1,3},{1,4},{2,3},{2,4},{4,3}};
        int N=4;//number of element used;

        System.out.println(findSolution(trust,N));
    }

    private static int findSolution(int[][] trust, int N) {

        int in[]=new int[N+1];

        int out[]=new int[N+1];

        for(int [] record: trust)
        {
            out[record[0]]++;
            in[record[1]]++;
        }
        for(int i=1;i<=N;i++)
        {
            if(in[i]==N-1 && out[i]==0)
                return i;
        }
        return -1;

    }
}
