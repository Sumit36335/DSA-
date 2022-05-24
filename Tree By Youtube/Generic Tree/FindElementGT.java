public static boolean find(Node node, int data) { 
 if(node.data== data)
 {
      return true; 
 }
 for(Node child : node.children)
 { 
     boolean fe = find(child,data);
     if(fe) 
     { 
        return true; 
     } 
  }
  return false;
  }
