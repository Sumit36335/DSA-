public static class TwoStack {
    int[] data;
    int top1;
    int top2;

    public TwoStack(int cap) {
      // write your code here
      data= new int[cap];
      top1=-1;
      top2=cap;
    }

    int size1() {
      // write your code here
      return (top1+1);
    }

    int size2() {
      // write your code here
       return (data.length-top2);
    }

    void push1(int val) {
      // write your code here
      if(size1()+size2()==data.length)
      {
        System.out.println("Stack overflow");
        return;
      }
      top1++;
      data[top1]=val;
    }

    void push2(int val) {
      // write your code here
      if(size1()+size2()==data.length)
      {
        System.out.println("Stack overflow");
        return;
      }
      top2--;
      data[top2]=val;
    }

    int pop1() {
      // write your code here
      if(top1==-1)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      int val=data[top1];
      top1--;
      return val;
    }

    int pop2() {
      // write your code here
      if(top2==data.length)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      int val=data[top2];
      top2++;
      return val;

    }

    int top1() {
      // write your code here
      if(top1==-1)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      return data[top1];
    }

    int top2() {
      // write your code here
      if(top2==data.length)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      return data[top2];
    }
  }
