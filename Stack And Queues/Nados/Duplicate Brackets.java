 public static void main(String[] args) throws Exception {
        Stack<Character> stk= new Stack<>();
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == ')')
            {
                if(stk.peek()=='(')
                {
                    System.out.println("true");
                    return;
                }
                else
                {
                    while(stk.peek()!='(')
                    {
                        stk.pop();
                    }
                    stk.pop();
                }

            }
            else
            {
                stk.push(ch);
            }
        }
        System.out.println("false");
    }
