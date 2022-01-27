 static Node segregate(Node head)
    {
        Node demo1 = new Node(-1);
        Node demo1Tail=demo1;

        Node demo2=new Node(-1);
        Node demo2Tail=demo2;
        
        Node demo3=new Node(-1);
        Node demo3Tail=demo3;

        while(head!=null)
        {
            if(head.data==0)
            {
                demo1Tail.next=head;
                demo1Tail=head;
            }
            else if(head.data==1)
            {
                demo2Tail.next=head;
                demo2Tail=head;
            }
            else if(head.data==2)
            {
                demo3Tail.next=head;
                demo3Tail=head;
            }
            head=head.next;
        }
        demo3Tail.next=null;
        demo2Tail.next=demo3.next;
        demo1Tail.next=demo2.next;
        
        return
