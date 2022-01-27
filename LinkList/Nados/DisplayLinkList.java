  public void display(){
     // if (size == 0 )return;

      Node curr = head ; 
       while ( curr != null ){
         System.out.print(curr.data + " ");
         curr = curr.next;
       }
       System.out.println();
    }
