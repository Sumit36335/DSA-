 public ListNode find(ListNode tail)
        {
            while(tail.next!=null)
            {
                tail=tail.next;
            }
            return tail;
        }
        public  static void reverse(ListNode curr)
        {
            if(curr.next==null||curr==null)
            {
                return ;
            }
            reverse(curr.next);
            curr.next.next=curr;
        }
        public ListNode reverseList(ListNode head) {
            if(head==null)
            {
                return head;
            }
            ListNode tail=find(head);
            reverse(head);
            ListNode demo=head;
            head= tail;
            tail= demo;
            tail.next=null;
            return head;
    }
