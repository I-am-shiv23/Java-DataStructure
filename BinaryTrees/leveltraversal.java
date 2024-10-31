import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.util.HashMap;

public class leveltraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // static class BinaryTree{
    // static int idx = -1;
    // public static Node buildTree(int nodes[]){
    // idx++;
    // if(nodes[idx] == -1){
    // return null;
    // }
    // Node newNode = new Node(nodes[idx]);
    // newNode.left = buildTree(nodes);
    // newNode.right = buildTree(nodes);

    // return newNode;
    // }

    // public static void preorder(Node root){
    // if(root == null){
    // System.out.print("-1 ");
    // return;
    // }
    // System.out.print(root.data+" ");
    // preorder(root.left);
    // preorder(root.right);
    // }
    // public static void inorder(Node root){
    // if(root == null){
    // return;
    // }
    // inorder(root.left);
    // System.out.println(root.data+" ");
    // inorder(root.right);
    // }
    // public static void postorder(Node root){
    // if(root == null){
    // return;
    // }
    // postorder(root.left);
    // postorder(root.right);
    // System.out.println(root.data+" ");
    // }
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node newNode = q.remove();
            if (newNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(newNode.data + " ");
                if (newNode.left != null) {
                    q.add(newNode.left);
                }
                if (newNode.right != null) {
                    q.add(newNode.right);

                }
            }
        }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }
    public static void levelfind(Node root,int level,int key){
        if(root == null){
            return ;
        }
        if(level == key){
            System.out.print(root.data+" ");
            return;
        }
         levelfind(root.left, level+1, key);
         levelfind(root.right, level+1, key);

    }
    public static boolean getPath(Node root,int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //last common ancestor

        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data== n2){
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node righLca = lca2(root.right,n1,n2);
        
        if(righLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return leftLca;
        }
        return root;
    }

    public static int KAncestor(Node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int righDist = KAncestor(root.right, n, k);
        
        if(leftDist == -1 && righDist == -1){
          return -1;
        }
        int max = Math.max(leftDist,righDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {

        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();

        // Node root = tree.buildTree(nodes);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /**
         * 2
         * / \
         * 4 5
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // System.out.println(isSubtree(root, subRoot));
    //    levelfind(root, 1, 3);
    // int n1 = 4,n2 = 5;
    // System.out.println(lca(root, n1, n2).data);
    KAncestor(root, 5, 2);

    }
}
