public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
      // write your code here
      return data.size();
    }

    void push(int val) {
      // write your code here
      if(data.size()==0)
      {
        data.push(val);
        min=val;
      }
      else if(val>=min)
      {
        data.push(val);
      }
      else{
        data.push(val+val-min);
        min=val;
      }
    }

    int pop() {
      // write your code here
      if(size()==0)
      {
        System.out.println("Stack  underflow");
        return -1;
      }
      else
      {
        if(data.peek()>=min)
        {
          return data.pop();
        }
        else
        {
          int val=min;
          min= 2*min-(data.pop());
          return val;
        }
      }
    }

    int top() {
      if(size()==0)
      {
        System.out.println("Stack  underflow");
        return -1;
      }
      else
      {
        if(data.peek()>=min)
        {
          return data.peek();
        }
        return min;
      }
    }

    int min() {
      // write your code here
      if(size()==0)
      {
        System.out.println("Stack  underflow");
        return -1;
      }
      else
      {
        return min;
      }
    }
  }
