public class traversal {
    

    public static void main(String[] args)
    {
        int m = 3;
        int n = 4;
        int[][] mat = new int[m][n];
       

        // left to right traversal

        for(int row = 0;row<m;row++)
        {
            for(int col = 0;col<n;col++)
            {
                System.out.print(mat[row][col]+" ");
        }
        System.out.println();
    }
    // right to left traversal

    for(int row = 0;row<m;row++)
    {
        for(int col = n-1;col>=0;col--)
        {
            System.out.print(mat[row][col]+" ");
        }
        System.out.println();
    }

    // top to down traversal
    for(int col = 0;col<n;col++)
    {
        for(int row = 0;row<m;row++)
        {
            System.out.print(mat[row][col]+" ");
        }
        System.out.println();

    }

    // bottom to top traversal

    for(int col = 0;col<n;col++)
    {
        for(int row = m-1;row>=0;row--)
        {
            System.out.print(mat[row][col]+" ");
        }
            System.out.println();
    }

}
}