  public static class CustomQueue {
    int[] data;
    int front;
    int size;
    int rear;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      size = 0;
      rear=0;
    }

    int size() {
      // write ur code here
      return size;
    }

    void display() {
      // write ur code here
      int count=size();
      int idx=front;
      while(count-->0)
      {
          System.out.print(data[idx]+" ");
          idx=(idx+1)%data.length;
      }
      System.out.println();
    }

    void add(int val) {
      // write ur code here
      if(size()==data.length)
      {
          System.out.println("Queue overflow");
          return;
      }
      data[rear]=val;
      size++;
      rear=(rear+1)%data.length;
      
    }

    int remove() {
      // write ur code here
      if(size()==0)
      {
          System.out.println("Queue underflow");
          return -1;
      }
      int val=data[front];
      size--;
      front=(front+1)%data.length;
      return val;
    }

    int peek() {
       // write ur code here
       if(size()==0)
       {
           System.out.println("Queue underflow");
           return -1;
       }
       return data[front];
       
    }
  }
