package Leetcode;
import java.util.Stack;
public class ValidParenthesisUsingString {
    public static void main(String args[]){
        String s="*()()*()**)))())";
    System.out.println(Validparenthesis(s));
    }
    private static boolean Validparenthesis(String s) {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> star=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(')
                open.push(i);
            else if(ch=='*')
                star.push(i);
            else
            {
                if(!open.isEmpty())
                    open.pop();
                else if(!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
        }

        return isBalanced(open,star);
    }

    private static boolean isBalanced(Stack<Integer> open, Stack<Integer> star) {
        while (!open.isEmpty()){
            if(star.isEmpty())
                return false;
            else if(star.peek()>open.peek())
            {
                  star.pop();open.pop();
            }
            else
                return false;
        }
        return true;
    }

}
