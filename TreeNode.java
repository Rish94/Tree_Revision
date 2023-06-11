//Logic
//Simple q me elemets (in) krte jao and remove krte jao jo remove kra uska left right q me (in) krte jao 


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        List<Integer> ll = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rv = q.poll();
            ll.add(rv.val);
            if(rv.left!=null){
                q1.add(rv.left);
            }
            if(rv.right!=null){
                q1.add(rv.right);
            }
            if(q.isEmpty()){
                ans.add(ll);
                ll = new ArrayList<Integer>();
                q = q1;
                q1 = new LinkedList<TreeNode>();
            }
        }
        return ans;
    }
}