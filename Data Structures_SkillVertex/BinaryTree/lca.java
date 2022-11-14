public class lca {
    

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      List<TreeNode> l1 =   ntrp(root,p);
      List<TreeNode> l2 =  ntrp(root,q);

      int i = l1.size() - 1;
      int j = l2.size() - 1;
        TreeNode LCA = null;
      while(i>=0 && j>=0)
      {
            if(l1.get(i) == l2.get(j))
            {
                LCA = l1.get(i);
            }
            i--;
            j--;
      }
      return LCA;
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


    public static void main(String[] args)
    {

    }
}
