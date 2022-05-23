 public static ArrayList<Integer> nodeToRootPath(Node curr, int data){
    if(curr.data==data)
    {
      ArrayList<Integer> list  = new ArrayList<>();
      list.add(curr.data);
      return list;  
    }
    for(Node child:curr.children)
    {
      ArrayList<Integer> ptc = nodeToRootPath(child,data);
      if(ptc.size()>0)
      {
        ptc.add(curr.data);
        return ptc;
      }
    }
    return new ArrayList<>();   
 }
