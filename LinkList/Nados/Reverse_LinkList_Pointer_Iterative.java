public class Reverse_LinkList_Pointer_Iterative {
    public static  class Node {
        int data;
        Node next;
    }
    public static class Linklist {
        Node head;
        Node tail;
        int size;
        public  void addFirst(int val) {
            Node temp= new Node();
            temp.data=val;
            if(size==0)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }
            size++;
        }
        public void reverse() {
            Node prev= null;
            Node curr=head;
            while(curr!=null)
            {
                Node ahead= curr.next;
                curr.next=prev;
                prev=curr;
                curr=ahead;
            }
            Node temp=head;
            head= tail;
            tail=temp;
        }
        public void display() {
            for(Node temp = head; temp != null; temp = temp.next) {
                System.out.println(temp.data + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Linklist link = new Linklist();
        link.addFirst(10);
        link.addFirst(20);
        link.addFirst(30);
        link.addFirst(40);
        link.addFirst(50);
        link.display();
        System.out.println("Your LinkList After Reversing");
        link.reverse();
        link.display();


    }
}
