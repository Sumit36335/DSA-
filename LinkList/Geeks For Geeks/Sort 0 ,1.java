public ListNode solve(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode dummyTail=dummy;

        ListNode demo=new ListNode(-1);
        ListNode demoTail=demo;

        while(head!=null)
        {
            if(head.val==0)
            {
                dummyTail.next=head;
                dummyTail=head;
            }
            else if(head.val==1)
            {
                demoTail.next=head;
                demoTail=head;
            }
            head=head.next;
        }
        demoTail.next=null;
        dummyTail.next=demo.next;
        return dummy.next;
    }
