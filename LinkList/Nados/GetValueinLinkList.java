  public int getAt(int idx){
      // write your code here
      if ( size == 0 ){
       System.out.println("List is empty");
       return -1;
     }
     if (idx < 0 || idx >=size){
       System.out.println("Invalid arguments");
       return -1 ;
     }

     if (idx == 0 ) return getFirst();

     if ( idx == size -1 ) return getLast();

     Node curr = head ; 

     for ( int i = 0  ; i< idx ; i++){
       curr = curr.next;
     }
     return curr.data;
       



    }
