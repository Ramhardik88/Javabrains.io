package io.search;
//time=o(n)
public class Linearsearch {
    public static void main(String []args){
        int[] num= {2,4,12,3,6,90,45,34,56};
        int find=6;
        int result=linearsearch(num,find);
        if(result==-1)
        {
            System.out.println("element not found");
        }
        else{
            System.out.println("element is found:"+ " "+result);
        }

    }
    public static int linearsearch(int[] num,int find){
        int i=0;
        while (i<num.length)
        {
            if(num[i]==find)
            {
                return i;
            }
            i=i+1;
        }

        return -1;
    }
}
