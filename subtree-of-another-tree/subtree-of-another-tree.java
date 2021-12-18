/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 public boolean checkMatch(TreeNode a, TreeNode b){
        if(a == null || b == null)
            return a == null && b == null;
        
        return a.val == b.val && checkMatch(a.left,b.left) && checkMatch(a.right,b.right);
  }

 public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root == null || subRoot == null){
           return root == null && subRoot == null;
       }
	   return checkMatch(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
}
}