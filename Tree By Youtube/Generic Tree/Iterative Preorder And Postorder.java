  static class Pair
  {
    Node node;
    int state;
    Pair(Node node, int state)
    {
      this.node=node;
      this.state=state;
    }

  }
  public static void IterativePreandPostOrder(Node node) {
    Stack<Pair> st =  new Stack<>();
    st.push(new Pair(node,-1));
    String  pre="";
    String post="";
    while(st.size()>0)
    {
      Pair top = st.peek();
      if(top.state==-1)
      {
          pre+=top.node.data+" ";
          top.state++;
      }
      else if(top.state==top.node.children.size()){
          post+= top.node.data+" ";
          st.pop();
      }
      else{
          Pair cp=new Pair(top.node.children.get(top.state),-1);
          st.push(cp);
          top.state++;
      }
    }
    System.out.println(pre);
    System.out.println(post);
  }
