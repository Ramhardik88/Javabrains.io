package string;

public class StringWithBackspace 
{
    public static void main(String[] args) {
        String s1="bcd##e";
        String s2="bd#e";
        System.out.println(isSolution(s1,s2));
    }

    private static boolean isSolution(String s1, String s2) {
        int end1=s1.length()-1;
        int end2=s2.length()-1;

        while (end1>0 && end2>0)
        {
            int str1Index=getChar(s1,end1);
            int str2Index=getChar(s2,end2);

            if(str1Index>0 && str2Index>0)
            {
                return  true;
            }
            if(str1Index>0 || str2Index>0)
                return false;
            if(s1.charAt(str1Index)!=s2.charAt(str2Index))
            {
                return false;
            }
            end1=str1Index-1;
            end2=str2Index-1;
        }

       return true;
    }

    private static int getChar(String s, int end) {
        int specialCharacter=0;
        while (end>0){
            if(s.charAt(end)!='#')
            {
                if(specialCharacter==0)
                {
                    return end;
                }else
                {
                    specialCharacter--;
                }

            }
            else
            {
                specialCharacter++;
            }
            end--;

        }
        return end;


    }
}
