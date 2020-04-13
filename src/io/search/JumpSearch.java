package io.search;

public class JumpSearch                //time -o((n/m)+(m-1))
                                                   //n/m=no of jumps
                                                          // m-1= n of element in the block
{
    public static void main(String[] args) {
        int integers[] = {2, 3, 4, 6, 7, 9, 12, 34, 56, 78,85,87,89, 90,100,110,112,122, 123, 456, 789, 1023, 4567};
        int elementToSearch = 4567;
        int result = jumpSearch(integers, elementToSearch);
        if (result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element is found:" + " " + result);
        }


    }

    public static int jumpSearch(int[] integers, int elementToSearch) {
        int arraylength=integers.length;
        System.out.println("Arraylength:"+arraylength);
        int jumpstep= (int) Math.sqrt(arraylength);
        System.out.println("jumptobesteped"+jumpstep);
        int prevstep=0;
        while (integers[Math.min(jumpstep,arraylength)-1]<elementToSearch) {
            prevstep=jumpstep;
            jumpstep+= (int) Math.sqrt(arraylength);
            if(prevstep>=arraylength)
                return -1;
        }
        while (integers[prevstep]<elementToSearch){
            prevstep++;
            if(prevstep==Math.min(jumpstep,arraylength))
                return -1;

        }
        if (integers[prevstep]==elementToSearch){
            return prevstep;
        }
        return -1;
    }

}
