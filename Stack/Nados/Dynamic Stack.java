void push(int val) {
      if (tos == data.length - 1) {
       int [] temp= new int[2*data.length];
       for(int i=0;i<data.length;i++)
       {
           temp[i]=data[i];
       }
       data =temp;
      } 
      tos++;
      data[tos] = val;
    }
