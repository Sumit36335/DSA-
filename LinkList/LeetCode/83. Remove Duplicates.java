 public ListNode deleteDuplicates(ListNode head) {
        ListNode demo=new ListNode(-1);
        ListNode  tail=demo;
        while(head!=null)
        {
            if(tail==demo || head.val!=tail.val)
            {
                tail.next=head;
                tail=head;
            }
            head=head.next;
        }
        tail.next=null;
        return demo.next;
    }
