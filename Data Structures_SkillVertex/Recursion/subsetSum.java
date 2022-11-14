import java.util.*;
public class subsetSum {
    // https://practice.geeksforgeeks.org/problems/subset-sums2234/1
    public static void subsetSums(List<Integer> arr,List<Integer> ans,int i,int ssf)
    {
        if(i == arr.size())
        {
            ans.add(ssf);
            return;
        }
        subsetSums(arr,ans,i+1,ssf+arr.get(i));      //yes
        subsetSums(arr,ans, i+1, ssf);                //no
    }

    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        subsetSums(arr,ans,0,0);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
