 public static class CustomStack {
    int[] arr;
    int top;

    public CustomStack(int cap) {

      arr = new int[cap];
      top = -1;
    }

    int size() {
       return top+1;
    }

    void display() {
       for(int i=top;i>=0;i--)
       {
         System.out.print(arr[i]+" ");
       }
       System.out.println();
    }

    void push(int val) {
      // write ur code here
      if(top==arr.length-1)
      {
        System.out.println("Stack overflow");
        return;
      }
      top++;
      arr[top]=val;
    }

    int pop() {
      if(top==-1)
      {
        System.out.println("Stack underflow");
        return-1;
      }
      int val=arr[top];
      top--;
      return val;
    }

    int top() {
       if(top==-1)
      {
        System.out.println("Stack underflow");
        return-1;
      }
      int val=arr[top];
      return val;
    }
  }
