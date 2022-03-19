 public static ArrayList<Integer> nodeToRootPath(Node curr, int data){
    // write your code here
    if(curr.data==data)
    {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(data);
        return res;
    }
    for(Node child: curr.children)
    {
      ArrayList<Integer>temp = nodeToRootPath(child,data);
      if(temp.size()>0)
      {
        temp.add(curr.data);
        return temp;
      }
    }
    return new ArrayList<>();
 }
