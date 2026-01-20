import java.util.Stack;

public class BaseBall_Game {
    public static int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String s:operations)
        {
            if(s.equals("+"))
            {
                int a=st.pop(); //2
                int b=st.pop(); // 5
                st.push(b);
                st.push(a);
                st.push(a+b);
            } else if(s.equals("D"))
            {
                st.push(st.peek()*2);
            } else if(s.equals("C"))
            {
                st.pop();
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!st.isEmpty())
        {
            ans+=st.pop();
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String ops []= {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
}
