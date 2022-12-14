package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createTree();
        System.out.println("PreOrder Traverse Recursive way");
        binaryTree.preOrderTraverseRecursively(binaryTree.root);
        binaryTree.preOrderTraverseIteratively(binaryTree.root);
        System.out.println("\nInOrder Traverse Recursive way");
        binaryTree.inOrderTraverseRecursively(binaryTree.root);
        binaryTree.inOrderTraverseIteratively(binaryTree.root);
        System.out.println("\nPostOrder Traverse Recursive way");
        binaryTree.postOrderRecursively(binaryTree.root);
        binaryTree.postOrderIteratively(binaryTree.root);
        binaryTree.levelOrderTraverse(binaryTree.root);
        System.out.println("\nMax Value " + binaryTree.findMaxValue(binaryTree.root));
    }

    public void createTree() {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root = node;
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
    }

    //PreOrder Traversal
    //    Visit root node
    //    Traverse the left subTree
    //    Traverse the right subTree
    public void preOrderTraverseRecursively(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraverseRecursively(root.left);
        preOrderTraverseRecursively(root.right);
    }

    public void preOrderTraverseIteratively(TreeNode root) {
        System.out.println("\nPreOrder Traverse Iterative way");
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    //IreOrder Traversal
    //    Traverse the left subTree
    //    Visit root node
    //    Traverse the right subTree
    public void inOrderTraverseRecursively(TreeNode root) {
        if (root == null) return;
        inOrderTraverseRecursively(root.left);
        System.out.print(root.data + " ");
        inOrderTraverseRecursively(root.right);
    }

    public void inOrderTraverseIteratively(TreeNode root) {
        System.out.println("\nInOrder Traverse Iterative way");
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    //PostOrder Traversal
    //    Traverse the left subTree
    //    Traverse the right subTree
    //    Visit root node
    public void postOrderRecursively(TreeNode root) {
        if (root == null) return;
        postOrderRecursively(root.left);
        postOrderRecursively(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrderIteratively(TreeNode root) {
        System.out.println("\nPostOrder Traverse Iteratively way");
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    public void levelOrderTraverse(TreeNode root) {
        System.out.println("\nLevel Order Traversal");
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public int findMaxValue(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        int result = root.data;
        int left = findMaxValue(root.left);
        int right = findMaxValue(root.right);
        if (result < left) result = left;
        if (result < right) result = right;
        return result;
    }

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
