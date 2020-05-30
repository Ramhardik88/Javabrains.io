package MassProblem;

import java.util.*;

public class CourseSchedule
{
    public static void main(String[] args) {
        int Prerequisitis[][]=new int[][]{{0,1},{1,2},{2,3}};
        int numCouses=3;
        isSolu(numCouses,Prerequisitis);
    }

    private static boolean isSolu(int numCouses, int[][] prerequisitis) {
        Map<Integer, ArrayList<Integer>> map=new HashMap<>();

        int [] indegree= new int[numCouses];

        Queue<Integer> queue= new LinkedList<>();
        int count=0;

        for(int i=0;i<numCouses;i++)
        {
            map.put(i,new ArrayList<>());
        }


        for(int i=0;i<prerequisitis.length;i++)
        {
            map.get(prerequisitis[i][0]).add(prerequisitis[i][1]);
            indegree[prerequisitis[i][1]]++;

        }
        for(int i=0;i< numCouses;i++)
        {
            if(indegree[i]==0)
            {
                queue.add(i);
            }
        }
        while (!queue.isEmpty())
        {
            int current = queue.poll();
            for(int i:map.get(current))
            {
                if(--indegree[i]==0)
                {
                    queue.add(i);
                }
            }
            count++;
        }
        return count==numCouses;
    }
}
