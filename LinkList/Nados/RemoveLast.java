 public void removeLast(){
      // write your code here
      if ( size == 0 ){
        System.out.println("List is empty");
        return;
     }

      if ( size == 1 ){
        head = tail = null;
      }else {
        Node prevTail = head;
        for ( int i = 0 ; i< size-2; i++){
          prevTail= prevTail.next;
        }

        prevTail.next = null;
        tail = prevTail;
      }
      size--;
    }
