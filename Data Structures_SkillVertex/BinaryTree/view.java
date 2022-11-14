public class view {
    



    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
      
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

                if(rn.right!=null)
                {
                    ll.addLast(rn.right);
                }
                if(rn.left!=null)
                {
                    ll.addLast(rn.left);            // add node's children in queue
                }

            }
            ans.add(sa.get(0));

        }
        return ans;
    }

    public static void main(String[] args)
    {

    }
}
