import java.util.*;
public class ngr {
    
    public static int[] ngr(int[] nums)
    {
        int[] ans = new int[nums.length];
        for(int i = 0;i<ans.length;i++)
        {
            ans[i] = -1;
        }
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i + 1;j<nums.length;j++)
            {
                if(nums[j]>nums[i])
                {
                    ans[i] = nums[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static int[] nge02(int[] nums)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[nums.length];

        //hard code 2 steps

        //1> 
        ans[ans.length - 1] = -1;
        //2
        st.push(nums[nums.length - 1]);

        for(int i = nums.length-2;i>=0;i--)
        {
            //1 pop all smaller ele

            int val = nums[i];

            while(st.size()>0&&val>=st.peek())
            {
                st.pop();
            }
            //2 update my ans
            if(st.size()==0)
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = st.peek();
            }

            //3 push current element in stack

            st.push(val);
        }

            return ans;
    }

    public static void main(String[] args)
    {
    //     int[] nums = {2,3,10,1,2,1,20,2,1};
    //   int[] ans   = ngr(nums);
    //   for(int i = 0;i<ans.length;i++)
    //   {
    //       System.out.print(ans[i] + " ");
    //   }

      int [] nums02 = {20,5,7,8};
      int [] ans02 = nge02(nums02);
      for(int i = 0;i<ans02.length;i++)
      {
          System.out.print(ans02[i] + " ");
      }



    }
}
