
public int maxDepth(Node root) {
        if(root==null)return 0;
        int height=0;
        for(Node child:root.children)
        {
            height=Math.max(height,maxDepth(child));
        }
        return 1+height;
    }
