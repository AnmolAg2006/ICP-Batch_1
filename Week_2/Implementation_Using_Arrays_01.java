public class Implementation_Using_Arrays_01{
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.isEmpty();
        st.push(1);
        st.push(2);
        st.pop();
        st.push(3);
        st.push(5);
        st.push(4);
        st.pop();
        st.push(7);
        st.pop();
        st.isEmpty();
    }
    static class Stack{
        public int arr[];
        int ptr;
        
        public Stack(int n){
            this.arr=new int[n];
            this.ptr=-1;
        }
        public void push(int n){
            if(ptr==arr.length-1) System.out.println("Stack Overflow Error");
            else arr[++ptr]=n;
        }
        public void pop()
        {
            if(ptr==-1) {
                System.out.println("Stack Underflow Error");
            }
            else System.out.println(arr[ptr--]);
            
        }
        public void peek(){
            if(ptr==-1) {
                System.out.println("Stack Underflow Error");
            }
            else System.out.println(arr[ptr]);
            
        }
        public void isEmpty()
        {
            if(ptr==-1) System.out.println(true);
            else System.out.println(false);
        }

    }
}