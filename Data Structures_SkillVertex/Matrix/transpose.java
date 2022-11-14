import java.util.*;
public class transpose {
    public static void getTranspose(int[][] mat)
    {
        for(int row = 0;row<mat.length;row++)
        {
            for(int col = row;col<mat[0].length;col++)
            {
                // (row,col <-> col,row)
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows and colms");
       int m = scn.nextInt();
       int n = scn.nextInt();

       int[][] mat = new int[m][n];  

      

       for(int i = 0;i<m;i++)
       {
           for(int j = 0;j<n;j++)
           {
               mat[i][j] = scn.nextInt();
           
       }
    }
        getTranspose(mat);

        for(int row = 0;row<m;row++)
        {
            for(int col = 0;col<n;col++)
            {
                System.out.print(mat[row][col]+" ");
        }
        System.out.println();
    }
}
}
