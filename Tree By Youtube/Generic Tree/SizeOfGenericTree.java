public static int size(Node node){
    // write your code here   
     int s=0;
     for(Node child : node.children)
     {
        int cs=size(child);
        s+=cs;
     }
     s+=1;
     return s;
  }
