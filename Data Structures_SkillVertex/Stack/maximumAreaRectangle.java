import java.util.*;
public class maximumAreaRectangle {
    
    public static  int largestRectangleArea(int[] heights) {
        int max = 0;
        int[] l = insl(heights);
        int[] r = insr(heights);
        for(int i = 0;i<heights.length;i++)
        { 
            int length = heights[i];

             int width = r[i]-l[i]-1;

             int Area  = length*width;
              max = Math.max(max,Area);
            
        }
        return max;
    }
    
    public static int[]  insl(int[] heights)
    {
         Stack<Integer> st = new Stack<>();
        int [] ans = new int[heights.length];
        ans[0] = -1; 
        st.push(0);
         // left to right

         for(int i = 1;i<heights.length;i++)
         {
             int val = heights[i];
           // pop all smaller ele
            while(st.size()>0&&heights[st.peek()] >= val)
            {
                st.pop();
            }

            // update ans
            if(st.size() == 0)
            {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();

            }
            // push current  ele in stack

            st.push(i);

         }
         return ans;

    }

    public static int[]  insr(int[] heights)
    {
         Stack<Integer> st = new Stack<>();
        int [] ans = new int[heights.length];
        ans[ans.length - 1] = heights.length; 
        st.push(heights.length-1);
        for(int i = heights.length-2;i>=0;i--)
        {
            //1 pop all smaller ele

            int val = heights[i];

            while(st.size()>0&&val<=heights[st.peek()])
            {
                st.pop();
            }
            //2 update my ans
            if(st.size()==0)
            {
                ans[i] = heights.length;
            }
            else
            {
                ans[i] = st.peek();
            }

            //3 push current element in stack

            st.push(i);
        }

            return ans;
    }


    public static void main(String[] args)
    {

    }
}
