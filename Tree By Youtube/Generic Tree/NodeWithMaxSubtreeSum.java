 static int msn = 0;
  static int ms = Integer.MIN_VALUE;

  static int nodeWithMax(Node node)
  {
    int sum=0;
    for(Node child:node.children)
    {
      int cs=nodeWithMax(child);
      sum+=cs;
    }
    sum+=node.data;
    if(sum>ms)
    {
      msn=node.data;
      ms=sum;
    }
    return sum;
  }
