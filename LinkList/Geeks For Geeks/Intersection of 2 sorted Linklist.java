 public static Node findIntersection(Node head1, Node head2)
    {
    Node dummy = new Node(-1);
    Node ans = dummy;
    Node temp1 = head1;
    Node temp2 = head2;
    while(temp1!=null && temp2!=null){
        if(temp1.data == temp2.data){
            ans.next=new Node(temp1.data);
            ans=ans.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        else if(temp1.data > temp2.data) {
            temp2 = temp2.next;
        }
        else if(temp2.data > temp1.data) {
            temp1 = temp1.next;
        }
    }
    return dummy.next;
    }
