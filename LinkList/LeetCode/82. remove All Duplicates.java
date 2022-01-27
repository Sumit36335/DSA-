public ListNode deleteDuplicates(ListNode head) {
        ListNode demo=new ListNode(-1);
        ListNode  tail=demo;
     
        while(head!=null)
        {
           if(head.next==null || head.next.val!= head.val)
           {
               tail.next=head;
               tail=head;
               head=head.next;
           }
            else
            {
                ListNode curr=head;
                while(curr!=null && curr.val==head.val)
                {
                    curr=curr.next;
                }
                head=curr;
            }
        }
        tail.next=null;
        return demo.next;
    }
