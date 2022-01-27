 public void removeFirst(){
      // write your code here

      if (size == 0 ){
        System.out.println("List is empty");
        return;
       }

      if ( size > 1 ){
        head = head.next;
      }else  {
        head =tail = null;  
      }
      size--;
    }
