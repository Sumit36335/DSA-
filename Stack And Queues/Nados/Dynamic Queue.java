oid add(int val) {
      // write ur code here
      if ( size() == data.length){
       int [] temp = new int[2*size()];
       int ct= size();
      int idx = front;
      int j =0 ;
      while(ct-->0){
       temp[j] = data[idx];
       j++;
        idx = (idx +1)%data.length;
      }
        front = 0 ;
        rear = size();
        data= temp;
      }
      data[rear] = val;
      size++;
      rear = (rear+1)%data.length;
      
    }
