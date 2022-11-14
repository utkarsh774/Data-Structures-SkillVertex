import java.util.*;
public class subsetVariation1 {
    //print all subsets
    public static void getSubsets(List<Integer> arr,int i,List<Integer> sa,List<List<Integer>> ans)
    {
        if(i == arr.size())
        {
            List<Integer> ba = new ArrayList<>(sa);
            ans.add(ba);
            return;
        }

        //yes
        sa.add(arr.get(i));
        getSubsets(arr,i+1,sa,ans);
        sa.remove(sa.size() - 1);

        //no
        getSubsets(arr, i+1, sa, ans);

    }

    public static void main(String[] args)
    {

    }
}
