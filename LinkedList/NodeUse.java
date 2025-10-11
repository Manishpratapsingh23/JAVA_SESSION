import java.util.Scanner;
public class NodeUse {
    public static void main(String args[]){
        Node head = input();
        //System.out.println(head.data);
        
        System.out.println("Original Node is");
        print(head);
        instertAtK(head, 10, 5);
        System.out.println();
        System.out.println("Modified Node is");
        print(head);



    }


    public static Node input(){
        Scanner sc = new Scanner(System.in);
        Node head = null, temp = null;
        int data = sc.nextInt();
        while(data!=-1){
            if(head==null){
                head = new Node(data);
                temp = head;
            } else {
                temp.next = new Node(data);
                temp = temp.next;
            }
            data = sc.nextInt();
        }
        return head;
    }


    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }

    public static Node instertAtK(Node head, int data, int k){
        if(k==1){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        while(k-1>1 && temp!=null){
            k--;
            temp = temp.next;
        }
        Node next = temp.next;
        temp.next = new Node(data);
        temp.next.next = next;
    }
    return head;

}
