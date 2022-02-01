void push(int val) {
      // write your code here
      mainQ.add(val);

    }

    int pop() {
      // write your code here
      if(mainQ.size()==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      int val=0;
      for(int i=0;i<mainQ.size();i++)
      {
          val=mainQ.remove();
          if(i<size())
          {
            mainQ.add(val);
          }
      }
      return val;
    }

    int top() {
      // write your code here
      if(mainQ.size()==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      int val=0;
       for(int i=0;i<mainQ.size();i++)
      {
          val=mainQ.remove();
          mainQ.add(val);
      }
      return val;
    }
