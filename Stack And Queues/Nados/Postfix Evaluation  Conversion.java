public static int precedence(char ch)
{
    if(ch=='+'|| ch =='-')
    {
        return 1;
    }
    else if(ch =='*'|| ch =='/')
    {
        return 2;
    }
    return 0;
}
public static int operation(int val1,int val2,char ch)
{
    if(ch=='+')
    {
        return val1+val2;
    }
    else if(ch=='-')
    {
        return val1-val2;
    }
    else if(ch=='*')
    {
        return val1*val2;
    }
    else if(ch =='/')
    {
        return val1/val2;
    }
    return 0;
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<Integer>value = new  Stack<>();
    Stack<String>prefix= new  Stack<>();
    Stack<String>infix = new  Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char ch = exp.charAt(i);
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
        {
            int val2=value.pop();
            int val1=value.pop();
            int ans = operation(val1,val2,ch);
            value.push(ans);

            String val4=infix.pop();
            String val3=infix.pop();
            infix.push("("+val3+ch+val4+")");

            String val6=prefix.pop();
            String val5=prefix.pop();
            prefix.push(ch+val5+val6);
        
        }
        else
        {
            value.push(ch-'0');
            prefix.push(ch+"");
            infix.push(ch+"");
        }
    }
    System.out.println(value.peek());
    System.out.println(infix.peek());
    System.out.println(prefix.peek());
 }
