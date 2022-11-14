import java.util.*;
public class demo
{

    public static void main(String[] args)
    {
        int m = 3;
        int n = 4;
        int[][] arr;   //declare
        arr = new int[m][n]; // initialization
    
        Scanner scn = new Scanner(System.in);
        for(int row = 0;row<m;row++)
        {
            for(int col = 0;col<n;col++)
            {
                arr[row][col] = scn.nextInt();
            }
        }
        for(int row = 0;row<m;row++)
        {
            for(int col = 0;col<n;col++)
            {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
        
    }
}