public class kaway {
    
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
           List<Integer> al = new ArrayList<>();
           al.add(root);
           return al;
        }

        //3
       List<Integer> rr1 = ntrp(root.left,key);
      if(rr1 != null)
      {
          rr1.add(root);
          return rr1;
      }
        
        //4
        List<Integer> rr2 = ntrp(root.right,key);
        if(rr2 != null)
        {
            rr2.add(root);
            return rr2;
        }
       //5
        return null;
    }
    public static void klevelDown(TreeNode root,TreeNode bn,int k,List<Integer> ans)
    {
        if(root == null || k< 0||root == bn) return;

        
        if(k == 0)
        {
            ans.add(root.val);
        }

        klevelDown(root.left,bn, k-1, ans);
        klevelDown(root.right,bn, k-1, ans);
    }
    public static  List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
      List<TreeNode> path =   ntrp(root,target);   
        List<Integer> ans = new ArrayList<>();
        TreeNode bn = null;
      for(int i = 0;i<path.size();i++)
      {
          TreeNode node = path.get(i);
        klevelDown(node,bn,k-i,ans);  
        bn =    node;
      }
      return ans;
    }
}
