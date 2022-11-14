import java.util.*;
public class dailyTemperature {
    

    public static void dailyTemperatures(int[] temperature)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[temperature.length];
        for(int i = temperature.length-1;i>=0;i--)
        {
            int val = temperature[i];

            // 1> pop all smaller ele

            while(st.size()>0 && temperature[st.peek()]<=val)
            {
              st.pop();   
            }

            // upadate ans

            if(st.size()==0)
            {
                ans[i] = 0;
            }
            else{
                ans[i] = st.peek() - i;
            }

            // push idx

            st.push(i);
        }

    }


    public static void main(String[] args)
    {

    }
}
