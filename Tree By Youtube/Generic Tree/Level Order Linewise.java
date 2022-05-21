public static void levelOrderLinewise1(Node root){
    // write your code here
    Queue<Node>mq= new ArrayDeque<>();
    Queue<Node>cq= new ArrayDeque<>();

    mq.add(node);

    while(mq.size()>0)
    {
      node = mq.remove();
      System.out.print(node.data+" ");
      for(Node child : node.children)
      {
        cq.add(child);
      }
      if(mq.size()==0)
      {
          mq=cq;
          cq= new ArrayDeque<>();
          System.out.println();          
      }
    }
  }
