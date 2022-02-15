public static int max(Node node) {
       int max = node.data;
       for(Node child:node.children)
       {
         max= Math.max(max,max(child));
       }
       return max;
  }
