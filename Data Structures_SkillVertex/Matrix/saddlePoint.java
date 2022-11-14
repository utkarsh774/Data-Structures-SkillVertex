import java.util.*;
public class saddlePoint {
         
    public static void saddlePoint()
    {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                mat[i][j] = scn.nextInt();
            }
        }

        for(int i = 0;i<n;i++)
        {
            int pot_ele = Integer.MAX_VALUE;
            int pot_col = 0;
            for(int j = 0;j<n;j++)
            {
                if(mat[i][j]<pot_ele)
                {
                    pot_ele = mat[i][j];
                    pot_col = j;
                }
            }
            boolean flag = false;
            for(int row = 0;row<n;row++)
            {
                if(mat[row][pot_col]>pot_ele)
                {
                    flag = true;
                }
            }
            if(flag == false)
            {
                System.out.println(mat[i][pot_col]);
                return;
            }
        }
        System.out.print("saddle point does not exist");
    }    
    
    public static void main(String[] args)
    {
        saddlePoint();       
    }
}
