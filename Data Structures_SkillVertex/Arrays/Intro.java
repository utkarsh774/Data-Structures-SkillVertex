import java.util.*;
public class Intro{
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] fun(int n){

        int[] arr = new int[n];
        return arr;
    }
    public static void main(String[] args){
             int n  = 5;
            //   int[] arr;  // declaration
            //   arr = new int[n];    //initialization
              
              int[] arr = new int[n];

                // arr[0] = 10;
                // arr[1] = 11;
                // arr[2] = 15;
                // arr[3] = 17;
                // arr[4] = 12;
            Scanner scn = new Scanner(System.in);

            // for(int i = 0;i<arr.length;i++){
            //     arr[i] = scn.nextInt();
            // }
            //arr[2] = 300;

            // for(int i = 0;i<arr.length;i++){
            //     System.out.println(arr[i]);
            // }
           
            print(fun(n));

        }
    }