package Leetcode_may;

public class TreeNode
{
    int value;
    TreeNode left;
    TreeNode right;

}

class solution{
    public int kthSmallest(TreeNode root, int k) {
       return solve(root,k);
    }

    private int solve(TreeNode root, int k) {
        if(root==null)
        {
            return -1;
        }
        int left=solve(root.left,k);
        if(left!=0)
        {
            return left;
        }
        k-=1;
        if(k==0)
        {
            return root.value;
        }

        int right=solve(root.right,k);

        return right;

    }

}
