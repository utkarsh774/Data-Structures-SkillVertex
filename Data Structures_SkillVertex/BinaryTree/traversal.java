public class traversal
{

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
    public static void preorderTraversal(TreeNode root,List<Integer> ans)
    {
        if(root == null ) return;

        ans.add(root.val);

        preorderTraversal(root.left,ans);
        preorderTraversal(root.right,ans);


    }
    public static void inorderTraversal(TreeNode root,List<Integer> ans)
    {
        if(root == null) return;

        inorderTraversal(root.left,ans);

        ans.add(root.val);

        inorderTraversal(root.right,ans);

        
    }

    public static void postorderTraversal(TreeNode root,List<Integer> ans)
    {
        if(root == null) return;

        postorderTraversal(root.left,ans);
        postorderTraversal(root.right,ans);

        ans.add(root.val);

    }
    public static void main(String[] args)
    {

    }
}