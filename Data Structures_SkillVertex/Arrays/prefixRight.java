public class prefixRight {
    
    public static void prefix(int[] arr,int[] prefix){
        int n = arr.length;
        prefix[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
                prefix[i]  =  arr[i] + prefix[i+1];
        }
    }

    public static void main(String[] args){

        int [] arr = {2,3,5,7};
        int[] prefix = new int[4];
        prefix(arr,prefix);
        for(int i = 0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
