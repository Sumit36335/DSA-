 public void addFirst(int val) {
      // write your code here

      // 1 . Creation of new Node 
      Node temp = new Node();
      temp.data = val ;
      if ( size == 0 ){
        head = temp ;
        tail = temp ;
      }else {
          // Agr size 0 nhi hai tb ye hoga 
        temp.next = head;// is line ko phle nhi lika toh Linked List loss ho jayegi  
        head = temp ;
      }
      size ++;
    }
