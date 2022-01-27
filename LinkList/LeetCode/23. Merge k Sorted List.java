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
    public static ListNode helper(ListNode[] list, int left,int right)
    {
        if(left==right)return list[right];
        int mid=(left+right)/2;
        ListNode lefty=helper(list,left,mid);
        ListNode righty=helper(list,mid+1,right);
        return mergeTwoLists(lefty,righty);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        return helper(lists,0,lists.length-1);
    }
