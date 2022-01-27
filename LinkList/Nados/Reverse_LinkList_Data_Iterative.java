public class Reverse_LinkList_Data_Iterative {
    public static  class Node {
        int data;
        Node next;
    }
    public static class Linklist {
        Node head;
        Node tail;
        int size;
        public  Node getAt(int  index) {
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
        public void reverse() {
            int left=1;
            int right=size;
            while(left<right)
            {
                Node leftNode= getAt(left);
                Node rightNode= getAt(right);
                int temp= leftNode.data;
                leftNode.data=rightNode.data;
                rightNode.data=temp;
                left++;
                right--;
            }
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
        link.reverse();
        link.display();


    }
}
