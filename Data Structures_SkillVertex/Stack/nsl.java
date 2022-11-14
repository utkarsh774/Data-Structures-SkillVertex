import java.util.*;
public class nsl {
    public static int[] nsl(int[] nums)
    {
        int[] ans = new int[nums.length];
        for(int i = 0;i<ans.length;i++)
        {
            ans[i] = -1;
        }
        int n = nums.length;
        for(int i = n-1;i>=0;i--)
        {
            for(int j = i -1 ; j>=0;j--)

            {
                if(nums[j]<nums[i])
                {
                    ans[i] = nums[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static int[] nsl02(int[] nums)
    {
        int[] ans = new int[nums.length];

        Stack<Integer> st = new Stack<>();

        // hard code
        ans[0] = -1;
        st.push(nums[0]);

        for(int i = 1;i<nums.length;i++)
        {
            int val = nums[i];
            // 1 pop all greater ele
            while(st.size()>0 && st.peek()>=val)
            {
                st.pop();
            }

            // update your ans
            if(st.size() == 0)
            {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            //push the current ele in the stack
            st.push(nums[i]);
        }
        return ans;
    } 
    public static void main(String[] args)
    {
         int[] nums = {10,20,5,2,7,5};
         int [] ans =   nsl(nums);

         for(int i = 0;i<ans.length;i++)
         {
             System.out.print(ans[i]  + " ");
         }
    }
}
