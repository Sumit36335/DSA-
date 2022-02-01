public static boolean isValid(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==')')
            {
                if(stk.isEmpty() || stk.peek()!='(')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
            }
            else if(ch=='}')
            {
                if(stk.isEmpty() || stk.peek()!='{')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
            }
            else if(ch==']')
            {
                if(stk.isEmpty() || stk.peek()!='[')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
            }
            else if((ch >='a'&& ch <='z')|| (ch == ' ')||(ch>='0'&&ch<='9') || (ch=='+')||(ch=='-')||(ch=='/')||(ch=='*')){
              continue;
            }
            else
            {
                stk.push(ch);
            }

        }
        return (stk.size()==0)?true:false;
    }


    public static void main(String[] args) throws Exception {
        Scanner  sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean s= isValid(str);
        System.out.println(s);
    }
