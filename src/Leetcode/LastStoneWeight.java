package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight
{
    public static void main(String []args){
        int [] stones={2,7,4,1,8,1};
        int result=laststone(stones);
        System.out.println(result);

    }
    public static int laststone(int []stones)
    {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
          for(int stone:stones)
          {
              pq.add(stone);
          }
          while (pq.size()>1)
          {
              pq.add(pq.poll()-pq.poll());
          }
          return pq.peek();

    }

}
