package Leetcode;

public class PerformshiftString
{
    public static void main(String []args){
        String s="abcdefg";
        int[][] shift={{1,1},{1,1},{0,2},{1,3}};

       System.out.println( stringshiftopt(s,shift));

    }

    private static String stringshiftopt(String s, int[][] shift) {
        int rotatecount=0;
        for(int [] value:shift){
            if(value[0]==0)
            {
                rotatecount+=value[1];
            }
            else
                rotatecount-=value[1];
        }
        rotatecount=rotatecount%s.length();
        if(rotatecount>0){
            s=leftShift(s,rotatecount);
        } else if(rotatecount<0){
            s=rightshift(s,-rotatecount);
        }
        return s;
    }

    private static String leftShift(String s, int rotatecount) {
        return s.substring(rotatecount)+s.substring(0,rotatecount);
    }
    private static String rightshift(String s, int rotatecount) {
        return s.substring(s.length()-rotatecount)+s.substring(0,s.length()-rotatecount);
    }
}
