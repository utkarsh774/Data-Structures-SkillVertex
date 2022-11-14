public class structure_change {
   
    
    
    
    public TreeNode invertTree(TreeNode root) {
     
        if(root == null) return null;
       TreeNode rr1 =  invertTree(root.left);
       TreeNode rr2 = invertTree(root.right);


       root.left = null;
       root.right = null;

       root.left = rr2;
       root.right = rr1;

       return root;

    }
    public TreeNode removeleaves(TreeNode root)
    {
        if(root == null) return null;
        if(root.left == null && root.right == null) return null;
        TreeNode rr1 = removeleaves(root.left);
        TreeNode rr2 = removeleaves(root.right);

        root.left = rr1;
        root.right = rr2;

    }

    public static void main(String[] args)
    {

    }
}
