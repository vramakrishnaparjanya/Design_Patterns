package Leetcode.Microsoft;

public class Count_Good_Nodes_in_Binary_Tree_1448 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    class Solution {

        public static int DFS_Tree(TreeNode node, int max_val){
            if(node == null){
                return 0;
            }
            int count =0;
            if(node.val>= max_val){
                count =1;
                max_val = node.val;
            }
            count+= DFS_Tree(node.left,max_val);
            count+= DFS_Tree(node.right,max_val);
            return count;
        }

        public static int goodNodes(TreeNode root) {
            return DFS_Tree(root, Integer.MIN_VALUE);
        }
    }


    public static TreeNode createBinaryTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);

        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createBinaryTree();

        System.out.println(Solution.goodNodes(root));

    }

}
