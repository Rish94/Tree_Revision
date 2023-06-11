
public class Diameteroftree {
      int val;
      Diameteroftree left;
      Diameteroftree right;
      Diameteroftree() {}
      Diameteroftree(int val) { this.val = val; }
      Diameteroftree(int val, Diameteroftree left, Diameteroftree right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
  }



class Solution {
    public int diameterOfBinaryTree(Diameteroftree root) {
        if(root==null){
            return 0;
        }
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int self = ht(root.left) + ht(root.right) + 2; // for 4 = -1 + -1 + 2 = 0 diameter
        return Math.max(ld,Math.max(self,rd));

    }

    public int ht(Diameteroftree root){
        
        if(root==null){
            return -1;
        }

        int left = ht(root.left);
        int right = ht(root.right);
        return Math.max(left,right) + 1;
    }
}