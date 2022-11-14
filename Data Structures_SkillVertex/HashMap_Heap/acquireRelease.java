import java.util.*;
public class acquireRelease
{

    public static ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr == null || k <=0)
        return ans;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        for(i = 0;i<k-1;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        i--;

        for(;i<arr.length-1;)
        {
            // acquire
            i++;
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);

            // work
            ans.add(hm.size());

            // release
            int release  = arr[i - (k - 1)];

            if(hm.get(release) == 1)
            {
                hm.remove(release);
            }
            else
            {
                hm.put(release,hm.get(release) -1);
            }
        }
        return ans;
	}

    public static int maxLen(int[] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxLen = 0;
        int i = -1;
        int sum = 0;
        hm.put(i,sum);
        
        while(i<arr.length -1)
        {
            i++;
            sum+=arr[i];

            hm.put(sum,i);

            if(hm.containsKey(sum)==false)
            {
                hm.put(sum,i);
            }
            else
            {
               int len = hm.get(sum);
               maxLen = Math.max(maxLen,i-len);
            }
        }
        return maxLen;
    }

    public static int count(int[] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int sum = 0;
        int i = -1;
        int ans = 0;
        hm.put(sum,1);

        while(i<arr.length - 1)
        {
            i++;
            sum+=arr[i];

            if(hm.containsKey(sum)==false)
            {
                hm.put(sum,1);
            }
            else
            {
                int of = hm.get(sum);
                ans+=of;

                hm.put(sum,of+1);
            }

        }
        return ans;
    }

    public static void main(String[] args)
    {

    }
}