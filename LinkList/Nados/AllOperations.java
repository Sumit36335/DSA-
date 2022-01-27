public class AllOperations {
    public static  class Node {
        int data;
        Node next;
    }
    public static class Linklist {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            if (size == 0) {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
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
        public void removeFirst() {
            if(size==0)
            {
                System.out.println("List is Empty");
                return ;
            }
            else if(size==1)
            {
                 head=null;
                 tail=null;
            }
            else
            {
                head= head.next;
            }
            size--;
        }
        public void removeLast() {
            if(size==0)
            {
                System.out.println("List is Empty");
                return ;
            }
            else if(size==1)
            {
                head=null;
                tail=null;
            }
            else
            {
                Node prev=head;
                for(int i=1;i<size-1;i++)
                {
                    prev=prev.next;
                }
                prev.next=null;
                tail=prev;

            }
            size--;
        }
        public  void addAt(int val,int idx){
            Node temp= new Node();
            temp.data=val;
            if(size==0)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                Node prev=head;
                for(int i=1;i<idx-1;i++)
                {
                    prev=prev.next;
                }
                temp.next=prev.next;
                prev.next=temp;
            }
            size++;
        }
        public void removeAt(int idx) {
            if(size==0)
            {
                System.out.println("List is Empty");
                return ;
            }
            else if(size==1)
            {
                head=null;
                tail=null;
            }
            else
            {
                Node prev=head;
                for(int i=1;i<idx-1;i++)
                {
                    prev=prev.next;
                }
                prev.next=prev.next.next;
            }
            size--;
        }
        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.println(temp.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        System.out.println("Now Add first Operation");
        list.addFirst(8);
        list.addFirst(5);
        list.addFirst(2);
        list.display();
        System.out.println("Now Remove first Operation");
        list.removeFirst();
        list.display();
        System.out.println("Now Remove last Operation");
        list.removeLast();
        list.display();
        System.out.println("Now Add At Index  Operation");
        list.addAt(100,3);
        list.display();
        System.out.println("Now Remove At Index  Operation");
        list.removeAt(3);
        list.display();
    }
}
