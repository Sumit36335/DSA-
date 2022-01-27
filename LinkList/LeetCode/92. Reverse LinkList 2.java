 public ListNode getAt(int val,ListNode temp)
    {
        for(int i=1;i<val;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void reverse(int left1,int right1,ListNode temp) 
    {
            int left=left1;
            int right=right1;
            while(left<right)
            {
                ListNode leftNode= getAt(left,temp);
                ListNode rightNode= getAt(right,temp);
                int tempo= leftNode.val;
                leftNode.val=rightNode.val;
                rightNode.val=tempo;
                left++;
                right--;
            }
    }  
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null)
        {
            return head;
        }
        reverse(left,right,head);
        return head;
        
    }
