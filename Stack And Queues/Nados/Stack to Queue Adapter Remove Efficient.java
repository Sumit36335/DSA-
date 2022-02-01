 void add(int val) {
        while(mainS.size()!=0)
        {
          helperS.push(mainS.pop());
        } 
        mainS.push(val);
        while(helperS.size()!=0)
        {
          mainS.push(helperS.pop());
        }
    }

    int remove() {
      if(mainS.size()==0)
      {
        System.out.println("Queue underflow");
        return -1 ;
      }
      int val= mainS.pop();
      return val; 
    }

    int peek() {
      if(mainS.size()==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      int val= mainS.peek();
      return val;
    }
