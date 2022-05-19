 public static int max(Node node) {
    int max= Integer.MIN_VALUE;
    for(Node child:node.children)
    {
        int cm = max(child);
        max=Math.max(cm,max);
    }
    max=Math.max(node.data,max);
    return max;
  }
