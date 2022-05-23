// o(n*n) solution

public static Node getTail(Node node)
  {
    while(node.children.size()==1)
    {
      node=node.children.get(0);
    }
    return node;
  }
  public static void linearize(Node node){
    
    for(Node child:node.children)
    {
      linearize(child);
    }
    while(node.children.size()>1)
    {
      Node ln=node.children.remove(node.children.size()-1);
      Node sln=node.children.get(node.children.size()-1);

      Node slnt=getTail(sln);

      slnt.children.add(ln);
    }
  }
// o(n) best approach

  public static Node linearize2(Node node)
  {
    if(node.children.size()==0)return node;
    Node last= linearize2(node.children.get(node.children.size()-1));
    while(node.children.size()>1)
    {
      Node lc=node.children.remove(node.children.size()-1);
      Node slc=node.children.get(node.children.size()-1);

      Node slt= linearize2(slc);
      slt.children.add(lc);
    }
    return last;
  }
