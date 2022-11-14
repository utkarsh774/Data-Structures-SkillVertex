public class prefixLeft {
    
    public static void prefix(int [] arr,int[] prefix){
            prefix[0] = arr[0];
            for(int i = 1;i<=prefix.length-1;i++){
                prefix[i] = prefix[i-1] + arr[i];
            }
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5};
        int[] prefix = new int[4];
        prefix(arr,prefix);
        for(int i = 0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
