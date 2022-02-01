public boolean isValid(String s) {
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
            else
            {
                stk.push(ch);
            }

        }
        return (stk.size()==0) ?true:false;
    }
