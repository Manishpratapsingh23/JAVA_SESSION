//package LinkedList;
public class PrintEvenOdd {
    public static void main(String[] args) {
        Node head = null;
        Node temp = head;
        for(int i=1;i<=15;i++){
            if(head==null){
                head = new Node(i);
                temp = head;
            } else {
                Node newNode = new Node(i);
                temp.next = newNode;
                temp = temp.next;
            }
        }
        temp = head;
        
        //printing
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
