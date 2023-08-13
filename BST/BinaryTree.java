
public class BinaryTree {

    TreeNode root;

    void BinaryTree() {
        this.root = null;
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

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);

        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            inorderTraversal(node.left);
            inorderTraversal(node.right);

        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            inorderTraversal(node.right);
            System.out.print(node.val + " ");

        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(20);
        System.out.print("In order traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Pre order traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Post order traversal:");
        tree.postorderTraversal(tree.root);
        System.out.println();

    }

}