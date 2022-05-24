  static int ceil;
  static int floor;
  public static void ceilAndFloor(Node node, int data) {
    
    if(node.data>data)
    {
      if(node.data<ceil)
      {
        ceil=node.data;
      }
    }
    if(node.data<data)
    {
      if(node.data>floor)
      {
        floor=node.data;
      }
    }
    for(Node child:node.children)
    {
      ceilAndFloor(child,data);
    }
  }
