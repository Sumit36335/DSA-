public static  ListNode mergeTwoLists(ListNode head1, ListNode head2){
        ListNode dummy =  new ListNode(-1);
        if(head1==null)return head2;
        if(head2==null)return head1;
        ListNode dummyTail= dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.val<head2.val)
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
    public static ListNode middle(ListNode head){
         ListNode fast= head;
         ListNode slow = head;
         ListNode prev=slow;
         while(fast!=null && fast.next!=null)
         {
             prev=slow;
             slow=slow.next;
             fast=fast.next.next;
         }
         if(fast==null)return prev;
         else
         {
             return slow;
         }
     }
    public static ListNode helper(ListNode head){
      if(head==null || head.next==null)
      {
          return head;
      }
      ListNode mid=middle(head);
      ListNode Middlenext= mid.next;
      mid.next=null;
        
      ListNode left=helper(head);
      ListNode right=helper(Middlenext);
        
      return mergeTwoLists(left,right);
    }
    public ListNode sortList(ListNode head) {
    
        if(head==null)
        {
            return head;
        }
        return  helper(head);
    }
}
