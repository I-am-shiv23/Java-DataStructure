import java.util.*;
public class linkedlistjava {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public  void addfirst(int data){
       Node a = new Node(data);
       size++;
       if(head == null){
         head = tail = a;
         return;
       }
        a.next = head;
        head = a;
    }
    public void addlast(int data){
        Node lastNode = new Node(data);
        size++;
        if(head == null){
            head = tail = lastNode;
        }
        tail.next = lastNode;
        tail = lastNode;
    }
    public static void printlinkedlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public void addmiddle(int idx,int data){
        if(idx == 0){
           addfirst(data);
            return;
        }
        Node mid = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while(i < idx-1){
            temp = temp.next;
        i++;
        }
      
        mid.next = temp.next;
        temp.next = mid;
       
       
    }
    public void removefirst(){
        if(head == null){
        head = tail = null;
        return;
        }
        size--;
        head = head.next;
    }
    public int removelast(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        
        prev.next = null;
        tail = prev;
        size--;
        return val;
        
    }
    
    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp!=null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exists
            }
        }
        return false;//cycle doesn't exist
    }

    public static void main(String[] args) {
        linkedlistjava list = new linkedlistjava();
        list.addfirst(238);
        list.addfirst(8);
        list.addfirst(2);
        list.addfirst(94);
        list.addfirst(18);
        list.addfirst(82);
        list.addfirst(29);
    //    printlinkedlist();
       list.printlinkedlist();
       
       if(isCycle()){
        System.out.println("cycle exist");
       }else{
        System.out.println("cycle doesn't exist");
       }
    
    }
}

