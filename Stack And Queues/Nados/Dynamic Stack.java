void push(int val) {
      if (top == data.length - 1) {
       int [] temp= new int[2*data.length];
       for(int i=0;i<data.length;i++)
       {
           temp[i]=data[i];
       }
       data =temp;
      } 
      top++;
      data[top] = val;
    }
