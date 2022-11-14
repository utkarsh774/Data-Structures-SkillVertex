public class ratate {
    
    public void rotate(int[][] mat)
    {
        // take transpose
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
        //swap cols
        int cmin = 0;
        int cmax = mat[0].length - 1;
        while(cmin<cmax)
        {
            for(int row = 0;row<mat.length;row++)
            {
                int temp = mat[row][cmin];
                mat[row][cmin] = mat[row][cmax];
                mat[row][cmax] = temp;
            }
            cmin++;
            cmax--;
        }
    }

    public static void main(String[] args)
    {

    }
}
