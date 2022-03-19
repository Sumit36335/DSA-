 public static void levelOrderLinewiseZZ(Node node){
    // write your code here
    Stack<Node> ms= new Stack<>();
    ms.push(node);
    Stack<Node> cs= new Stack<>();
    int level=1;
    while(ms.size()!=0)
    {
      Node curr= ms.pop();
      System.out.print(curr.data+" ");

      if(level%2==1)
      {
        for(int i=0;i<curr.children.size();i++)
        {
            Node child=curr.children.get(i);
            cs.push(child);
        }
      }
      else
      {
        for(int i=curr.children.size()-1;i>=0;i--)
        {
          Node child=curr.children.get(i);
          cs.push(child);
        }
      }
      if(ms.size()==0)
      {
        ms=cs;
        cs = new Stack<>();
        level++;
        System.out.println();
      }
    }
  }
