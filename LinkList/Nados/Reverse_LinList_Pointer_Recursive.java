public class Reverse_LinList_Pointer_Recursive {

    public static class Node {
        int data;
        Node next;
    }

    public static class Linklist {
        Node head;
        Node tail;
        int size;


        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public void reverse(Node curr) {
           if(curr.next==null||curr==null)
           {
               return;
           }
           reverse(curr.next);
           curr.next.next=curr;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
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
        Node temp= link.head;
        link.reverse(temp);
        Node demo= link.head;
        link.head= link.tail;
        link.tail=demo;
        link.tail.next=null;
        link.display();
    }
}