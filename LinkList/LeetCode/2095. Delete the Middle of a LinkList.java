public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        {
            head=null;
            return head;
        }
        ListNode slow= head;
        ListNode fast=head.next;
        if(fast.next==null)
        {
            slow.next=null;
            return head;
        }
        while(fast.next!=null&& fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
