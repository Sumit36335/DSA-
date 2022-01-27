  boolean isCircular(Node head)
    {
	 if(head==null || head.next==null)
        {
            return false;
        }
        if(head.next==head)
        {
            return true;
        }
        else
        {
           Node slow=head;
           Node fast=head;
           while(fast!=null && fast.next!=null)
           {
              slow=slow.next;
              fast=fast.next.next;
               if(slow==fast)
               {
                  return true;  
               }
           }
           return false;
         }	
    }
