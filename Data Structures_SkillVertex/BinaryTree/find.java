public class find {
    public static class TreeNode 
    {
        int val;
        TreeNode  left;
        TreeNode right;

        TreeNode(int val)
        {
            this.val = val;
        }
    }

    public static boolean isPresent(TreeNode root,int key)
    {

        if(root == null) return false;  // 1

        //2
        if(root.val == key)
        {
            return true;
        }

        //3
       boolean rr1 = isPresent(root.left,key);
        if(rr1 == true)
        {
            return true;
        }
        
        //4
        boolean rr2 = isPresent(root.right,key);
        if(rr2 == true)
        {
            return true;
        }
       //5
        return false;
    }
    public static void  main(String[] args)
    {

    }
}
