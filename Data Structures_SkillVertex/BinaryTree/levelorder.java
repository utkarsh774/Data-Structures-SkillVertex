public class levelorder {
   
    
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

    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> ba = new ArrayList<>();
        if(root == null) return ba;
      
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.addLast(root);
        while(ll.size()!=0)
        {
            int size = ll.size();
            List<Integer> sa = new ArrayList<>();

            for(int i = 1;i<=size;i++)
            {
                TreeNode rn = ll.removeFirst();  // remove node

                sa.add(rn.val);                     // add in list

                if(rn.left!=null)
                {
                    ll.addLast(rn.left);
                }
                if(rn.right!=null)
                {
                    ll.addLast(rn.right);            // add node's children in queue
                }

            }
            ba.add(sa);

        }
        
    }


    public static void main(String[] args)

    {

    }
}
