int getNthFromLast(Node head, int k)
    {
    	 Node slow=head,fast=head;
    while(fast !=null && k-- >0)
    {
        fast=fast.next;
        
    }
    if(k>0)return -1;
    while(fast!=null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    return slow.data;
    }
