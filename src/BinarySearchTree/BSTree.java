package BinarySearchTree;

public class BSTree {
    private TreeNode root;

    public static void main(String[] args) {

    }

    public void insertNode(int data) {
        root = insertNode(root, data);
    }

    public TreeNode insertNode(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
