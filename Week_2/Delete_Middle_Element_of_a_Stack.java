import java.util.*;
public class Delete_Middle_Element_of_a_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int size = st.size();
        fun(st,size/2);
        System.out.println(st);
    }
    public static void fun(Stack<Integer>st,int size)
    {
        if(size==0){
            System.out.println(st.peek());
            st.pop();
            return;
        }
        int n=st.pop();
        fun(st,size-1);
        st.push(n);
    }
    
}
