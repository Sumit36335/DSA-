void add(int val) {
      // write your code here
      mainS.push(val);
    }

    int remove() {
       if(mainS.size()==0)
       {
         System.out.println("Queue underflow");
         return -1;
       }
       while(mainS.size()!=0)
       {
          helperS.push(mainS.pop());
       }
       int val = helperS.pop();
       while(helperS.size()!=0)
       {
         mainS.push(helperS.pop());
       }
       return val;
    }

    int peek() {
      // write your code here
       if(mainS.size()==0)
       {
         System.out.println("Queue underflow");
         return -1;
       }
       while(mainS.size()!=0)
       {
          helperS.push(mainS.pop());
       }
       int val = helperS.peek();
       while(helperS.size()!=0)
       {
         mainS.push(helperS.pop());
       }
       return val;
    }
