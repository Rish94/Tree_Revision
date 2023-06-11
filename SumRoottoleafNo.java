


public class SumRoottoleafNo {
      int val;
      SumRoottoleafNo left;
      SumRoottoleafNo right;
      SumRoottoleafNo() {}
      SumRoottoleafNo(int val) { this.val = val; }
      SumRoottoleafNo(int val, SumRoottoleafNo left, SumRoottoleafNo right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
  }



class Solution {
    public int sumNumbers(SumRoottoleafNo root) {
        return Sum(root,0);
    }
    
     public int Sum(SumRoottoleafNo root,int ans){
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return ans * 10 + root.val;
            }

            int left = Sum(root.left,ans*10+root.val);
            int right = Sum(root.right,ans*10+root.val);
            return left + right;
        }
}
    
