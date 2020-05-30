package Matrix;

public class CountValue
{
    public static void main(String[] args) {
        int [][] matrix={{2,7,15},{4,9,19},{6,10,24}};
        int element_to_be_search=10;
        System.out.println(  isSolutionsmall(element_to_be_search,matrix));
        System.out.println(isSolutionLarge(element_to_be_search,matrix));
    }

    private static int isSolutionLarge(int value, int[][] matrix) {
        if(matrix.length==0)
        {
            System.out.println("matrix doesNot exists");
        }
        int totalrow=matrix.length;
        int totalcolumn=matrix[0].length;

        int row=0;
        int column=totalcolumn-1;
        int count=0;
        while (row<totalrow && column>=0)
        {
            if(value<=matrix[row][column])
            {
                count=count+(totalrow-row);
                column--;
            }
            else
            {
                row++;
            }
        }
        return count;
    }

    private static int isSolutionsmall(int value, int[][] matrix) {
        if(matrix.length==0)
        {
            System.out.println("matrix doesNot exists");
        }
        int totalrow=matrix.length;
        int totalcolumn=matrix[0].length;
        int count=0;
        int row=0;
        int column=totalcolumn-1;

        while (row<totalrow && column>=0)
        {
            if(value>=matrix[row][column])
            {
                count=count+column+1;
                row++;
            }
            else {
                column--;
            }

        }
        return count;
    }
}
