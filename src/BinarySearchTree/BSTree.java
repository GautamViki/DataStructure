package BinarySearchTree;

public class BSTree {
    private TreeNode root;

    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        bsTree.insertNode(5);
        bsTree.insertNode(3);
        bsTree.insertNode(7);
        bsTree.insertNode(1);
        bsTree.insertNode(4);
        bsTree.insertNode(6);
        bsTree.insertNode(8);
        bsTree.inOrderTraverse(bsTree.root);


        TreeNode node = bsTree.searchKey(bsTree.root, 3);
        if (node != null) {
            System.out.println("\nKey Found !!");
        } else {
            System.out.println("\nKey not Found !!");
        }
    }

    //
    public void inOrderTraverse(TreeNode root) {
        if (root == null) return;
        inOrderTraverse(root.left);
        System.out.print(root.data + " ");
        inOrderTraverse(root.right);
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

    public TreeNode searchKey(TreeNode root, int key) {
        if (root == null || root.data == key) return root;
        if (key < root.data) {
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
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
