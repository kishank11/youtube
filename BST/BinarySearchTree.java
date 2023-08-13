
public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int val) {
        root = insertRecursive(root, val);
    }

    TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);

        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);

        }
        return root;
    }

    void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.left);

            System.out.print(node.val + " ");
            printInorder(node.right);
        }
    }

}
