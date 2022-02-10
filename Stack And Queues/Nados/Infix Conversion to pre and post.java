public static int precedence(char op){
    if(op == '+' || op == '-') return 1;
    else if(op == '/' || op == '*') return 2;
    return 0;
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    
    Stack<String>prefix= new Stack<>();
    Stack<String>postfix= new Stack<>();
    Stack<Character>operators= new Stack<>();

    for(int i=0;i<exp.length();i++)
    {
        char ch = exp.charAt(i);

        if( (ch>='0'&&ch<='9') || (ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z') )
        {
            prefix.push(ch+"");
            postfix.push(ch+"");
        }
        else if(ch=='(')
        {
            operators.push(ch);
        }
        else if(ch==')')
        {
            while(operators.peek()!='(')
            {
                char op=operators.pop();

                String val2=prefix.pop();
                String val1=prefix.pop();
                String ans = op+val1+val2;
                prefix.push(ans);


                String val4=postfix.pop();
                String val3=postfix.pop();
                String ans1 = val3+val4+op;
                postfix.push(ans1);
            }   
            operators.pop();
        }
        else if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
        {
            while(operators.size()>0 && operators.peek()!='(' 
            && precedence(ch)<=precedence(operators.peek()))
            {
                char op=operators.pop();

                String val2=prefix.pop();
                String val1=prefix.pop();
                String ans = op+val1+val2;
                prefix.push(ans);


                String val4=postfix.pop();
                String val3=postfix.pop();
                String ans1 = val3+val4+op;
                postfix.push(ans1);
            } 
            operators.push(ch);
        }
    }
    while(operators.size()>0)
    {
        char op=operators.pop();

        String val2=prefix.pop();
        String val1=prefix.pop();
        String ans = op+val1+val2;
        prefix.push(ans);


        String val4=postfix.pop();
        String val3=postfix.pop();
        String ans1 = val3+val4+op;
        postfix.push(ans1);
    }  
    
    System.out.println(postfix.peek());
    System.out.println(prefix.peek());
 }
