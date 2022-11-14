import java.util.*;
public class reverseArray {
    

    public static void reverse(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
    swap(arr,start,end);
    start++;
    end--;

    }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        reverse(arr);
        for(int i = 0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
