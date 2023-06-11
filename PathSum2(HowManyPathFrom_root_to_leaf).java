
import java.util.*;


public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
  }





class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> presentPath = new ArrayList<>();
        FindSumWithPath(root,targetSum,ans,presentPath);
        return ans;
    }

    public static void FindSumWithPath(TreeNode root,int tar,List<List<Integer>> ans,List<Integer> presentPath){

        if(root==null){
            return;
        }

        if(root.left==null && root.right==null && tar-root.val==0){
            presentPath.add(root.val);
            ans.add(new ArrayList<>(presentPath));
            presentPath.remove(presentPath.size()-1);
        }

        presentPath.add(root.val);
        FindSumWithPath(root.left,tar-root.val,ans,presentPath);
        FindSumWithPath(root.right,tar-root.val,ans,presentPath);
        presentPath.remove(presentPath.size()-1);

    }
}