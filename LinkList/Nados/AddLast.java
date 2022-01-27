 void addLast(int val) {
      // Write your code here
      // 1 . Creation a new Node 

      Node temp = new Node();
      temp.data = val ; 
      
      if ( size == 0 ){
        // New Node is the first as well as last node
        head = temp;
        tail = temp;

      }else {
        tail.next = temp;
        tail = temp ;  
      }

      size++;
    }
  }
