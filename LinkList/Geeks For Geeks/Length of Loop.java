 static int countNodesinLoop(Node head)
    {
        //Add your code here.
          Node slow=head;
          Node fast=head;
           while(fast!=null && fast.next!=null)
           {
              slow=slow.next;
              fast=fast.next.next;
               if(slow==fast)
               {
                  break;
               }
           }
           if(fast==null || fast.next==null)
           {
               return 0;
           }
           int dist=1;
           Node curr=slow.next;
           while(curr!=slow)
           {
               dist++;
               curr=curr.next;
           }
           return dist;
           
    }
