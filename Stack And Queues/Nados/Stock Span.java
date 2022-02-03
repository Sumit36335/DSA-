public static int[] solve(int[] arr){
   Stack<Integer>stk = new Stack<>();
   int [] ans = new int[arr.length];
   ans[0]=1;
   stk.push(0);
   for(int i=1;i<arr.length;i++)
   {
     while(stk.isEmpty()==false &&  arr[i]>arr[stk.peek()])
     {
       stk.pop();
     }
     if(stk.isEmpty()==true)
     {
       ans[i]=i+1;
     }
     else
     {
       ans[i]= i-stk.peek();
     }
     stk.push(i);
   }
   return ans;
 }
