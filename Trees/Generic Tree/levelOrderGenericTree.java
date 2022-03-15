public static void levelOrder(Node node){
    // write your code here
    Queue<Node>q=new ArrayDeque<>();
    q.add(node);
    while(q.size()>0)
    {
      node curr = q.remove();
      System.out.print(curr.data+" ");
      
      for(Node child:curr.children)
      {
        q.add(child);
      }
    }
    System.out.println(".");
  }
