package Number;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=123;

       // System.out.println(reverseInt(num));
        System.out.println(reverseIntMAXandMIN(num));
    }

    private static int reverseIntMAXandMIN(int num) {
        int r=0;
        int pop=0;
        while (num!=0)
        {
            pop=num%10;
            num/=10;
            if((r>Integer.MAX_VALUE/10 || r==Integer.MAX_VALUE && pop>7))
                return 0;
            if(r<=Integer.MIN_VALUE/10 && pop<-8)
                return 0;
            r=r*10+pop;
        }
        return r;

    }

    private static int reverseInt(int num) {
      int flag=0,r=0;
      if(num<0)
      {
          flag=1;
          num=Math.abs(num);
      }
      while (num>0)
      {
          r=r*10+num%10;
          num=num/10;
      }
      if(flag==1)
      {
          r=r*(-1);
      }
      return r;
    }
}
