  
   1. approach piche se agge (Ulta Chalnege)
   ans[arr.length-1]=-1;
   stk.push(arr[arr.length-1]);
   for(int i=arr.length-2;i>=0;i--)
   {
     while(stk.size()>0 && arr[i]>=stk.peek())
     {
       stk.pop();
     }
     if(stk.size()==0)
     {
       ans[i]=-1;
     }
     else
     {
       ans[i] = stk.peek();
     }
     stk.push(arr[i]);

   2. approach agge se piche 

   Arrays.fill(ans,-1);
   for(int i=0;i<arr.length;i++)
   {
     while(stk.isEmpty()==false && arr[stk.peek()]<arr[i])
     {
       ans[stk.pop()]=arr[i];
     }
     stk.push(i);
   }
