package Number;

import java.util.Scanner;

public class SteepingNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to range ");
         int no=sc.nextInt();
//        int range = sc.nextInt();
        //321-->3-2=1 ,2-1=1
        //count=2; count variable denotes the value of 1 or -1;
        // digits=3
        //digits=count+1; so its steeping no;
//        int range=100;
//        int no = 1;
       // while (no <= range) {
            int temp = no;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
            //  System.out.println("the digits are :"+count);
            int temp_count = no;
            int prev_count = -1;
            int diff_count = 0;

            while (temp_count > 0) {
                int current_count = temp_count % 10;
                if (prev_count != -1) {
                    int diff = current_count - prev_count;
                    if (diff == -1)   /// for negative condition 2-3 =-1  it may assume the same 1
                    {
                        diff = 1;
                    }
                    if (diff != 1) {
                        break;
                    } else {
                        diff_count++;
                    }
                }
                temp_count = temp_count / 10;  // to go for next digits
                prev_count = current_count;  // change the last value to previous value;
            }
           //  System.out.println(digits + "  " + diff_count);
            if (diff_count == digits - 1) {
                System.out.print( no+"the number is steeping no");
            } else {
                System.out.println(no+"it is not a steeping no");
            }

//            no++;
//        }

    }
}
