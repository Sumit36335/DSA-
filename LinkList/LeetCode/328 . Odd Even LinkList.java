public ListNode oddEvenList(ListNode head) {
         int count = 1;
        ListNode evenDummy = new ListNode(-1), oddDummy = new ListNode(-1);
        ListNode evenTail = evenDummy, oddTail = oddDummy;
        while(head != null){
            if(count%2 == 0){
                evenTail.next = head;
                evenTail = head;
            }else{
                oddTail.next = head;
                oddTail = head;
            }
            head = head.next;
            count++;
        }
        oddTail.next = evenDummy.next;
        evenTail.next = null;
        return oddDummy.next;
    }
