package Leetcode;
// using burteForce approch time==o(n^2)
 public class ContiguousArray
{
    public static void main(String []args){
        int []num={1,0,0,1,0,1,0,1};
        int n=num.length;
       int result= fixedLengthArray(num,n);
          System.out.println(result);

    }
    public static int fixedLengthArray(int num[],int size) {

        int maxlen=0;


        for(int i=0;i<num.length;i++){
            int Zerocount=0,onecount=0;
            for(int j=i;j<num.length;j++){
                if(num[j]==0){
                    Zerocount++;
                }
                else if (num[j]==1){
                    onecount++;
                }
                if(Zerocount==onecount){
                    maxlen=Math.max(maxlen,j-i+1);
                }

            }
        }


        return maxlen;
    }
}
