  public static int height(Node node) {
    int h =-1;
    for(Node child:node.children)
    {
      int ch= height(child);
      h= Math.max(ch,h);
    }
    h+=1;

    return h;
  }
