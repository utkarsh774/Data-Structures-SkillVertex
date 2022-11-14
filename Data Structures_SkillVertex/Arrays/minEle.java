public class minEle {
    
  public static int findMinInArray(int[] arr){
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
     return max; 
  }

    public static void main(String[] args){
        int[] arr = {2,6,10,-1,0};
       // System.out.print(findMinInArray(arr));
       int ans = findMinInArray(arr);
       System.out.print(ans);
    }
}
