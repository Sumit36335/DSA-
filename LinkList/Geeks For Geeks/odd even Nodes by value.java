 Node divide(int N, Node head){
       Node even = new Node(-1);
       Node evenTail = even;
       
       Node odd = new Node(-1);
       Node oddTail = odd;
        
       while(head!=null)
       {
           if(head.data%2==1)
           {
               oddTail.next=head;
               oddTail=head;
               
           }
           else
           {
               evenTail.next=head;
               evenTail=head;
           }
           head=head.next;
       }
       oddTail.next=null;
       evenTail.next=odd.next;
       return even.next;
    }
