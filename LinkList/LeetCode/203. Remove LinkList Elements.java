 public ListNode removeElements(ListNode head, int val) 
    {
        ListNode temp=head;
        ListNode dummy= new ListNode(-1);
        ListNode dummyTail=dummy;
        while(head!=null)
        {
          if(head.val ==val)
          {
              head=head.next;
          }
          else
          {
              dummyTail.next=head;
              dummyTail=head;
              head=head.next;
          }
        }
        dummyTail.next=null;
        return dummy.next;
    }
