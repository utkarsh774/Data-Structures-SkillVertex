import java.util.*;
public class spiral {
    
    public static List<Integer> traverseSpirally(int[][] mat)
    {
        int rmin = 0;
        int rmax = mat.length - 1;
        int cmin = 0;
        int cmax = mat[0].length - 1;
       int count = 0;
       int n = mat.length;
       int m = mat[0].length;
       List<Integer> al = new ArrayList<>();
        while(count<n*m)
    {
         // top boundry
         for(int col = cmin;col<=cmax;col++)
         {
             al.add(mat[rmin][col]);
             count++;
 
         }
         rmin++;
 
         // right boundry
 
         for(int row = rmin;row<=rmax;row++)
         {
             al.add(mat[row][cmax]);
             count++;
         }
         cmax--;
 
         // bottom boundy
 
         for(int col = cmax;col>=cmin;col--)
         {
             al.add(mat[rmax][col]);
             count++;
         }
         rmax--;
 
         // left boundry
         for(int row = rmax;row>=rmin;row--)
         {
             al.add(mat[row][cmin]);
             count++;
         }
         cmin++;
    }
            return al;
    }

    public static void main(String[] args)
    {
        
    }
}
