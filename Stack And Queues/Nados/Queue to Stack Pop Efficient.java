void push(int val) {
      // write your code here 
      while(mainQ.size()!=0)
      {
        helperQ.add(mainQ.remove());
      }
      mainQ.add(val);
      while(helperQ.size()!=0)
      {
        mainQ.add(helperQ.remove());
      }
    }

    int pop() {
       if(mainQ.size()==0)
       {
         System.out.println("Stack overflow");
         return -1;
       }
       return mainQ.remove();
    }

    int top() {
      // write your code here
       if(mainQ.size()==0)
       {
         System.out.println("Stack overflow");
         return -1;
       }
       return mainQ.peek();
    }
