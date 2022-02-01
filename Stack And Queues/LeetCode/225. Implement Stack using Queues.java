class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    public void push(int x) {
      q.add(x);  
    }
    
    public int pop() {
        if ( q.size() == 0){
                return -1;
            }
            
            int val = 0 ;
            for ( int i = 0 ; i<q.size(); i++){
                val = q.remove();
                if(i<q.size())
                    q.add(val);
            }
            return val;
    }
    
    public int top() {
         if ( q.size() == 0){
                return -1;
            }
            
            int val = 0 ;
            for ( int i = 0 ; i<q.size(); i++){
                val = q.remove();
                q.add(val);
            }
            return val;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
