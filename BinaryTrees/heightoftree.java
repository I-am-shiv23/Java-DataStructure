public class heightoftree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countofnode(Node root) {
        if (root == null) {
            return 0;
        }
        int ln = countofnode(root.left);
        int rn = countofnode(root.right);

        return ln + rn + 1;

    }

    public static int sumofnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int ln = sumofnodes(root.left);
        int rn = sumofnodes(root.right);

        return ln + rn + root.data;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(2);
        a.left.left = new Node(3);
        a.left.right = new Node(4);
        a.right.left = new Node(5);
        a.right.right = new Node(6);
        System.out.println(sumofnodes(a));
    }

}
