public static Node getTail(Node curr){
            while(curr!=null && curr.next != null)
                curr = curr.next;
            return curr;
        }
    public static Node partition(Node head, int x) {
            Node rDummy = new Node(-1), lDummy = new Node(-1), rTail = rDummy, lTail = lDummy;
            while(head != null){
                if(head.data < x){
                    lTail.next = head;
                    lTail = head;
                    head = head.next;
                }else{
                    rTail.next = head;
                    rTail = head;
                    head = head.next;
                }
            }
            lTail.next = null;
            rTail.next = null;
            return lDummy.next;
    }
    public static Node quickSort(Node head){
         if(head == null || head.next == null)
                return head;
            
            Node left = quickSort(partition(head, head.data));
            Node right = quickSort(head.next);
            head.next = right;
            
            if(left == null)
                return head;
            
            Node leftTail = getTail(left);
            leftTail.next = head;
            return left;
    }
