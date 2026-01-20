import java.util.Stack;

public class Next_Greater_Element_1 {
    public static int[] nge(int arr[]) {
        Stack<Integer>st=new Stack<>();
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                arr1[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            arr1[st.pop()]=-1;
        }
        return arr1;
    }
    public static int fun(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                return i;
            }
        }
        return -1;
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=nge(nums2);
        int n=nums1.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=arr[fun(nums2,nums1[i])];
        }
        return ans;    
    }
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        int ans[]=nextGreaterElement(nums1,nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
