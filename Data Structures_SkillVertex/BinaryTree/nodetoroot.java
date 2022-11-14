public class nodetoroot {
 
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

    public static List<TreeNode> ntrp(TreeNode root,TreeNode node)
    {
        if(root == null) return null;  // 1

        //2
        if(root.val == node.val)
        {
            List<TreeNode> al = new ArrayList<>();
           al.add(root);
           return al;
        }

        //3
        List<TreeNode> rr1 = ntrp(root.left,node);
      if(rr1 != null)
      {
          rr1.add(root);
          return rr1;
      }
        
        //4
        List<TreeNode> rr2 = ntrp(root.right,node);
        if(rr2 != null)
        {
            rr2.add(root);
            return rr2;
        }
       //5
        return null;
    }
}
