package Matrix;

public class RowANDColumn
{
    public static void main(String[] args) {
        int [][] matrix={{2,7,15},{4,9,19},{6,10,24}};
        int element_to_be_search=10;
        isSolution(element_to_be_search,matrix);
        
    }

    private static void isSolution(int value, int[][] matrix) {

        if(matrix.length==0)
        {
            System.out.println("matrix does not exits");
        }
        int totalrow=matrix.length;
        int totalcolumn=matrix[0].length;

        int row=0;
        int column=totalcolumn-1;

        while(row< totalrow && column>=0)
        {
            if(matrix[row][column]==value)
            {
                System.out.println("the index are: "+row+" "+column);
                return;
            }
            if(value>matrix[row][column])
            {
                row++;
            }else
            {
                column--;
            }

        }

        System.out.println("number not found");


    }
}

