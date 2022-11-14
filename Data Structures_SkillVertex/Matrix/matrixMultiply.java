public class matrixMultiply
{

    public void matrixMultiply(int[][] A,int[][] B)
    {
        int n1 = A.length;
        int m1 = A[0].length;

        int n2 = B.length;
        int m2 = B[0].length;

        if(m1!=n2)
        {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int[][] C = new int[A.length][B[0].length];

        // to fill the i and j position of the resultant matrix
        // we keep i pointer on the rows of Matrix A and j pointer on the colms of Matrix B
        for(int i = 0;i<n1;i++)
        {
            for(int j = 0;j<m2;j++)
            {
                // dot product
                for(int k = 0;k<n2;k++)
                {
                    C[i][j] += (A[i][k]*B[k][j]);
                }
            }
        }


    }
    public static void main(String[] args)
    {
        
    }
}