 Node sortedMerge(Node head1, Node head2) {
        Node dummy =  new Node(-1);
        if(head1==null)return head2;
        if(head2==null)return head1;
        Node dummyTail= dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data)
            {
                dummyTail.next=head1;
                head1=head1.next;
            }
            else
            {
                dummyTail.next=head2;
                head2=head2.next;
            }
            dummyTail=dummyTail.next;
        }
        if(head1!=null)dummyTail.next=head1;
        if(head2!=null)dummyTail.next=head2;
        return dummy.next;
   } 
