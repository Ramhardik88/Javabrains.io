package Leetcode_may;



public class Max_sum_Circular_Array {
    public static void main(String[] args) {


        int arr[] = {5, -3, -2, 6, -1, 4};
        System.out.println(solution(arr));

    }

    private static int solution(int[] arr) {
        int arraysum = 0;
        int maxStraightsum = Integer.MIN_VALUE;
        int minStraightsum = Integer.MAX_VALUE;
        int tempMaxSum=0;
        int TempMinSum=0;

        for (int i = 0; i < arr.length; i++) {
            arraysum+=arr[i];

            tempMaxSum+=arr[i];

            maxStraightsum=maxStraightsum<tempMaxSum?tempMaxSum:maxStraightsum;

            tempMaxSum=tempMaxSum<0?0:tempMaxSum;


            TempMinSum+=arr[i];

            minStraightsum=minStraightsum>TempMinSum?TempMinSum:minStraightsum;

            TempMinSum=TempMinSum>0?0:TempMinSum;
        }

        if(arraysum==minStraightsum)
        {
            return maxStraightsum;
        }
        return Math.max(maxStraightsum,(arraysum-minStraightsum));

    }
}
