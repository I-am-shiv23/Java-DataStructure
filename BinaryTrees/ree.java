/**
 * Innerpreorder1
 */

import java.util.*;
 public class Tree {
   static class Node{
      int data;
      Node left;
      Node right;

      Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
      }
    }
    public static void leveltraversal(Node root){
            
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode == null){
            System.out.println();
           if(q.isEmpty()){
            break;
           }else{
            q.add(null);
           }
           }else{
            System.out.print(currNode.data + " ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }

    }
    static class BinaryTree{
       
        public static void buildpreorder(Node node){
            if(node == null){
                return;
            }
          
            buildpreorder(node.left);
           
            buildpreorder(node.right);
            System.out.println(node.data);
    
        }
        static int idx = -1;
         static Node preorder(int[] nodes){
         idx++;
         if(nodes[idx]==-1){
            
            return null;
         }

         Node n = new Node(nodes[idx]);

         n.left = preorder(nodes);
         n.right = preorder(nodes);

         return n;

        }
    }
    // public static int height(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int lh = height(root.left);
    //     int rh = height(root.right);

    //     return Math.max(lh, rh)+1;
    // }
     
    public static void main(String[] args) {
        int nodes[] = {1,2,3,4,5,6};
        BinaryTree build = new BinaryTree();
       Node ans = build.preorder(nodes);
    //    System.out.println(ans.data);
        // build.buildpreorder(ans);
        // leveltraversal(ans);
       
        // System.out.println(height(ans));
        
    }
}
