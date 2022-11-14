public class basicProblems {
    

    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static int size(Node root)
    {
        if(root == null) return 0;
        int rr1 = size(root.left);

        int rr2 = size(root.right);

        int ans = rr1 + rr2 + 1;

        return ans;

    }
   
    public static int height(Node root)
    {
        if(root == null) return 0;       // in terms of nodes
        // if(root == -1) return -1;  // in terms of edges
        int lh = height(root.left);
        
        int rh = height(root.right);

        int ans = Math.max(lh,rh) + 1;

        return ans;
    }


   
    public static int sum(Node root)
    {
        if(root == null) return 0;
        
        int ls = sum(root.left);

        int rs = sum(root.right);

        int ans = ls + rs + root.data;

        return ans;
    }

    public static int max(Node root)
    {

        if(root == null) return Integer.MIN_VALUE;
        int lm = max(root.left);

        int rm = max(root.right);

        int ans  =   Math.max(Math.max(lm,rm),root.val);

        return ans;


    }

    public static int min(Node root)
    {
        if(root == null) return Integer.MAX_VALUE;
        int lm = min(root.left);

        int rm = min(root.right);

        int ans  =   Math.min(Math.min(lm,rm),root.val);

        return ans;
    }
    
    public static void main(String[] args)
    {

    }
}
