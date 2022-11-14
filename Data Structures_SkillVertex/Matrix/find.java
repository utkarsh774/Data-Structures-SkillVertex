import java.util.*;
public class find {
  
    public static boolean isPresent()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows and colms");
       int m = scn.nextInt();
       int n = scn.nextInt();

       int[][] mat = new int[m][n];  //m*n

       System.out.println("Enter values");

       for(int i = 0;i<m;i++)
       {
           for(int j = 0;j<n;j++)
           {
               mat[i][j] = scn.nextInt();
           
       }
    }
       System.out.println("Enter a target");

       int target = scn.nextInt();
 /// traversing the matrix
       for(int row = 0;row<m;row++)
       {
           for(int col = 0;col<n;col++)
           {
               if(mat[row][col] == target)
               {
                   return true;
               }
           }
       }
       return false;

    }
    public static void main(String[] args)
    {
        boolean ans=isPresent();
        System.out.print(ans);
        
    }
}
