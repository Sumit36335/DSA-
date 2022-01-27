public int sizefind(ListNode temp){
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
    public ListNode getAt(int idx,ListNode curr){
      if(idx==0)
      {
          return curr;
      }
      else
      {
          for ( int i = 0  ; i< idx ; i++){
          curr = curr.next;
          }
      }
     return curr;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode temp=new ListNode (-1);
        temp.next=head;
        int size= sizefind(head);
        int idx=size-n;
        ListNode item=getAt(idx,temp);
        item.next=item.next.next;
        if(size==n)
        {
            return item.next;
        }
        return head;
    }
