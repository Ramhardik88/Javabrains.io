package MassProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PossibleBiPartition
{
    public static void main(String[] args) {
        int dislikes[][]={{1,3},{1,4},{2,4},{1,2}};
        int N=4;
        System.out.println(possibleBiPartition(dislikes,N));
    }

    private static boolean possibleBiPartition(int[][] dislikes, int n) {
        List<Integer>[] graph = new List[n+1];
        int []color=new int[n+1];

        for(int i=0;i<=n;i++)
        {
            graph[i]=new ArrayList<>();
        }

        for(int[]v:dislikes)
        {
            graph[v[0]].add(v[1]);
            graph[v[1]].add(v[0]);
        }

        for(int i=1;i<=n;i++)
        {
            if(color[i]==0)
            {
                LinkedList<Integer> queue=new LinkedList<>();
                queue.add(i);
                color[i]=1;
                while (queue.size()!=0)
                {
                    int top=queue.removeFirst();
                    for(int neighbor:graph[top])
                    {
                        if(color[neighbor]==color[top])
                            return false;
                        if(color[neighbor]==0)
                        {
                            color[neighbor]=-color[top];
                            queue.add(neighbor);
                        }
                    }
                }
            }

        }
        return true;

    }
}
