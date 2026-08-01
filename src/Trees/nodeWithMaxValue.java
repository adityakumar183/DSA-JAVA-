package Trees;

public class nodeWithMaxValue {
    public static int MaxNode(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int max = root.val;
        int leftmax = MaxNode(root.left);
        int rightmax = MaxNode(root.right);

        return Math.max(max,Math.max(leftmax,rightmax));
    }

    public static int MinNode(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int min = root.val;
        int leftmin = MinNode(root.left);
        int rightmin = MinNode(root.right);

        return Math.min(min,Math.min(leftmin,rightmin));
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

        System.out.println("Maximum value of Node = " + MaxNode(a));
        System.out.println("Minimum value of Node = " + MinNode(a));
    }
}
