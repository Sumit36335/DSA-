public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it''s index (not position), if there is not then
        // print "none"
        Stack<Integer>val= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            val.push(i);
        }
        while(val.size()>=2)
        {
            int i= val.pop();
            int j= val.pop();
            if(arr[i][j]==1)
            {
                // iska mtlb i janta  he j ko  i celebrity nhi he 
                val.push(j);
            }
            else
            {
                val.push(i);
            }
        }
        int ci = val.peek();
        for(int i=0;i<arr.length;i++)
        {
            if(i!=ci)
            {
                if(arr[i][ci]==0|| arr[ci][i]==1)
                {
                  System.out.println("none");
                  return;
                }
            }
        }
        System.out.println(ci);
    }
