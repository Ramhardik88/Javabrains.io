package string;

public class PrintFirstCharacter
{
    public static void main(String []args){
        String s=" hello world java ";
        char a[]=s.toCharArray();
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=' '){
                if(i==0){
                    System.out.println(a[i]);
                }
                else if(a[i-1]==' '){
                    System.out.println(a[i]);
                }

            }
        }
    }
}
