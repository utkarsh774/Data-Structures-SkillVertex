import java.util.*;
public class subsetVariation2 {
   
    // subset sum equal to target

    public static void getSubset(List<Integer> arr,int i,int target,List<Integer> sa,List<List<Integer>> ba)
    {
        if(target<0)
        return;
        if(i == arr.size())
        {
            if(target == 0)
            {
                List<Integer> ans = new ArrayList<>(sa);
                ba.add(ans);
            }
            return;
        } 
        sa.add(arr.get(i));
        getSubset(arr,i+1,target-arr.get(i),sa,ba);
        sa.remove(sa.size() -1);
        getSubset(arr,i+1,target,sa,ba);
    }
     public static void main(String[] args) {
         List<Integer> sa = new ArrayList<>();
         List<List<Integer>> ba = new ArrayList<>();
         List<Integer> arr = new ArrayList<>();
         arr.add(2);
         arr.add(3);
         arr.add(5);
         arr.add(7);
         int target = 10;
        getSubset(arr,0,target,sa,ba);
        System.out.println(ba);
    }
    
}
