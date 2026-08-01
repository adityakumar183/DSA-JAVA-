package Trees;

public class sumOfTreeNode {
    public static int treeSum(Node root) {
        if (root == null) return 0;
        int sum = root.val + treeSum(root.left) + treeSum(root.right);
        return sum;
    }
    public static void main(String[] args) {
        Node a = new Node(1);   //  a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g;
        e.right = h;

        System.out.println("Sum of Tree Node : " + treeSum(a));
    }
}
