public class Reverse_LinkList_Data_Recursive {
    public static  class Node {
        int data;
        Node next;
    }
    public static class Linklist {
        Node head;
        Node tail;
        int size;
        public Node getAt(int  index) {
            if(index==1)
            {
                return head;
            }
            else
            {
                Node temp = head;
                for(int i=1;i<index;i++)
                {
                    temp=temp.next;
                }
                return temp;
            }
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
        public void swap(Node left,Node right) {
            int temp=left.data;
            left.data= right.data;
            right.data=temp;
        }
        public Node reverse(Node left,Node right,int counter) {
            if(left==null)
            {
                return right;
            }
            right = reverse(left.next,right,counter+1);
            if(counter>=size/2)
            {
                swap(left,right);
            }
            right=right.next;
            return right;
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
        link.reverse(link.head, link.head, 0);
        link.display();

    }
}
