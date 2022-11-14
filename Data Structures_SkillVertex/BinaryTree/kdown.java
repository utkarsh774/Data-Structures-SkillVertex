public class kdown {
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
    
    public static void klevelDown(TreeNode root,int k,List<TreeNode> ans)
    {
        if(root == null || k< 0) return;

        
        if(k == 0)
        {
            ans.add(root);
        }

        klevelDown(root.left, k-1, ans);
        klevelDown(root.right, k-1, ans);
    }
}
