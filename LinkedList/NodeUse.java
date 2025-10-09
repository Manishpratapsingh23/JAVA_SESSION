import java.util.*;
public class NodeUse {
    public static void main(String args[]){
        Node head = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(9);
        head.next = n2;
        n2.next = n3;
        //System.out.println(head.next);
        //System.out.println(n2);
        //System.out.println(n3);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(head);
        System.out.println(temp);
    }


}
