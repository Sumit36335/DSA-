  public static void removeLeaves(Node node) {
    // write your code here
    if(node == null)return ;
    for(int i= node.children.size()-1;i>=0;i--)
    {
      Node child=node.children.get(i);

      if(child.children.size()==0)
      {
        node.children.remove(i);
      }
    }
    for(Node child:node.children)
    {
      removeLeaves(child);
    }
  }
