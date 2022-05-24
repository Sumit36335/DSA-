  static Node predecessor;
  static Node successor;
  static int state=0;
  public static void predecessorAndSuccessor(Node node, int data) {
    
    if(state==0)
    {
        if(node.data==data)
        {
            state=1;
        }
        else
        {
            predecessor=node;
        }
    }
    else if(state==1)
    {
        successor=node;
        state=2;
    }
    
    for(Node child:node.children)
    {
        predecessorAndSuccessor(child,data);
    }
  }
