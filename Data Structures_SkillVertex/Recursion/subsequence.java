public class subsequence
{

    public static int count = 0;
    public static void getSubsequence(int[] arr,int idx,StringBuilder sb)
    {
        if(idx == arr.length)
        {
            System.out.println(sb);
            count++;
            return;
        }
       
        sb.append(arr[idx]);
        getSubsequence(arr,idx+1,sb);  //yes
        sb.deleteCharAt(sb.length() -1);
        getSubsequence(arr,idx+1,sb);           // no

    }

    public static void main(String[] args)
    {
        int[] arr = new int[]{2,3,5,7};
        StringBuilder sb = new StringBuilder();
        getSubsequence(arr,0,sb);
        System.out.println(count);
    }
}