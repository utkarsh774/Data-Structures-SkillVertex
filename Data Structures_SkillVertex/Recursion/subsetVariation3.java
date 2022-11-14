import java.util.*;
public class subsetVariation3 {
    // is there a subset that sums to target

    public static boolean getSubset(List<Integer> ans,int i,int target)
    {
        if(target == 0)
        {
            return true;
        }
        if(i == ans.size())
        {
            if(target == 0)
            {
                return true;
            }
            return false;
        }

       return  getSubset(ans,i+1,target-ans.get(i))||getSubset(ans,i+1,target);
    }

    public static void main(String[] args)
    {
       
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        int target = 10;
       System.out.print(getSubset(arr,0,target));
       
    }
}
