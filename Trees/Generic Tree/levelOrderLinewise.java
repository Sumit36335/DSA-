 public static void levelOrderLinewise1(Node root){
    // write your code here
    Queue<Node>mainQ= new ArrayDeque<>();
    mainQ.add(root);

    while(mainQ.size()!=0)
    {
      Queue<Node>childQ= new ArrayDeque<>();
      while(mainQ.size()!=0)
      {
          Node curr= mainQ.remove();
          System.out.print(curr.data+" ");
          for(Node child:curr.children)
          {
            childQ.add(child);
          }
      }
      System.out.println();
      mainQ=childQ;
    }
  }
