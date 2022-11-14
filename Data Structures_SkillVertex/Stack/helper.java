public class helper {
    
    public static void main(String[] args)
    {
        int[] arr  =  new int[10];


         int i = 5;

        arr[i] = 10;
        arr[i+1] = 10;
        for(int j = 0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
