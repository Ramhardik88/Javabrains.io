package string;

public class Premutation_of_String {
    public static void main(String[] args) {
        String str = "12";
        premutation("",str);
    }

    private static void premutation(String prefix, String str) {
        int n=str.length();
        if(n==0)
            System.out.println(prefix);
        else{
            for(int i=0;i<n;i++)
            {
                premutation(prefix+str.charAt(i),
                        str.substring(0,i)+str.substring(i+1,n));
            }
        }
    }


}
