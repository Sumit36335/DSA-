 public void removeAt(int idx) {
     if (size == 0 ){
       System.out.println("List is empty");
       return;
     }

     if ( idx < 0 || idx>=size){
       System.out.println("Invalid arguments");
       return;
     }

     if ( idx == 0 ) removeFirst();
     else if ( idx ==size -1)  removeLast();
     else {
       Node prev = head ;
       for ( int i = 0 ; i< idx -1 ; i++){
         prev = prev.next;
       }

       prev.next = prev.next.next;
       size--;
     }
    }
