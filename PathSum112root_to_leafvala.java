
//root to leaf node vala path sum 


public class PathSum112root_to_leafvala {
      int val;
      PathSum112root_to_leafvala left;
      PathSum112root_to_leafvala right;
      PathSum112root_to_leafvala() {}
      PathSum112root_to_leafvala(int val) { this.val = val; }
      PathSum112root_to_leafvala(int val, PathSum112root_to_leafvala left, PathSum112root_to_leafvala right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
  }






class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        

        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return targetSum - root.val ==0;
        }

        boolean ls = hasPathSum(root.left,targetSum-root.val);
        boolean rs = hasPathSum(root.right,targetSum-root.val);
        return ls||rs;
    }
}