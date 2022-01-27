 public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
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
          
           if(fast==null||fast.next==null)
           {
               return;
           }
               
               Node curr1=head,curr2=slow;
               if(curr1==curr2)
               {
                 while(curr2.next!=curr1)
                 {
                    curr2=curr2.next;
                 }
               }
               else
               {
                  while(curr1.next!=curr2.next)
                  {
                     curr1=curr1.next;
                     curr2=curr2.next;              
                  }
                }
                curr2.next=null;
    }
