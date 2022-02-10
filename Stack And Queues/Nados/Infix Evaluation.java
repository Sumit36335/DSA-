 public static int precedence(char ch)
  {
      if(ch =='+'|| ch =='-')
      {
          return 1;
      }
      else if(ch=='/'|| ch=='*')
      {
          return 2;
      }
      return 0;
  }
  public static int  operation(int val1,int val2, char ch)
  {
      if(ch =='+'){
          return val1+val2;
      }
      else if(ch =='-')
      {
          return val1-val2;

      }
      else if(ch=='*')
      {
          return val1*val2;
      }
      else if(ch=='/')
      {
          return val1/val2;
      }
      return 0;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<Integer>operand=new Stack<>();
    Stack<Character>operator=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char ch = exp.charAt(i);
        if(ch>='0'&& ch<='9')
        {
            operand.push(ch-'0');
        }
        else if(ch=='(')
        {
            operator.push(ch);
        }
        else if(ch==')')
        {
            while(operator.peek()!='(')
            {
                char op=operator.pop();
                int val2=operand.pop();
                int val1=operand.pop();
                
                int ans =operation(val1,val2,op);
                operand.push(ans);
            }
            operator.pop();
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
        {
            while(operator.size()!=0 && operator.peek()!='('&& 
            precedence(ch)<=precedence(operator.peek()))
            {
                char op=operator.pop();
                int val2=operand.pop();
                int val1=operand.pop();
                
                int ans =operation(val1,val2,op);
                operand.push(ans);
            }
            operator.push(ch);
        }
    }
    while(operator.size()!=0)
    {
        char op=operator.pop();
        int val2=operand.pop();
        int val1=operand.pop();
                
        int ans =operation(val1,val2,op);
        operand.push(ans);  
    }
     System.out.println(operand.peek());
 }
