public ListNode getAt(int val,ListNode temp)
    {
        for(int i=0;i<val;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public int sizefind(ListNode temp){
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
    public static void swap(ListNode first,ListNode second)
    {
        int temp= first.val;
        first.val=second.val;
        second.val=temp;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int size= sizefind(head);
        ListNode leftIndex  = getAt(k-1,head);
        ListNode rightIndex = getAt(size-k,head);
        swap(leftIndex,rightIndex);
        return head;
    }
