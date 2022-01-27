 public ListNode addTwoNumbersprevious(ListNode l1, ListNode l2) {
        ListNode  result= new ListNode(-1);
        ListNode resultTail=result;
        int count=0;
        while(l1!=null ||l2!=null||count>0)
        {
            int d1= (l1==null)?0:l1.val; 
            int d2= (l2==null)?0:l2.val;
            
            ListNode temp = new ListNode((d1+d2+count)%10);
            count=(d1+d2+count)/10;
            
            resultTail.next=temp;
            resultTail=temp;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return reverse(result.next);
    }
    public ListNode reverse(ListNode head){
       ListNode curr=head;
       ListNode currTail=curr;
       ListNode prev=null;
       while(curr!=null)
       {
         ListNode ahead= curr.next;
         curr.next=prev;
         prev=curr;
         curr=ahead;
       }
       return  prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       l1 = reverse(l1);
       l2= reverse(l2);
       return addTwoNumbersprevious(l1,l2); 
    }
