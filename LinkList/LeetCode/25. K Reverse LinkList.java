public int sizefind(ListNode temp){
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode currHead=new ListNode(-1);
        ListNode currTail=currHead;
        int size= sizefind(head);
        while(size>0)
        {
            ListNode prevHead=new ListNode(-1);
            ListNode prevTail=prevHead;
            if(size>=k)
            {
                for(int i=0;i<k;i++)
                {
                    ListNode temp=head;
                    head=head.next;
                    temp.next=prevTail.next;
                    prevTail.next=temp;
                }
                currTail.next=prevTail.next;
                while(currTail.next!=null)
                {
                    currTail=currTail.next;
                }
                size-=k;
            }
            else
            {
                currTail.next=head;
                break;
            }
        }
        return currHead.next;
    }
