import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                st.push(i);
            } else {
                int l=st.pop();
                if(st.isEmpty())
                {
                    ans.append(s.substring(l+1,i));
                }
            }
        }
        return ans.toString();
    }
    
}
