public class printPermutation {
    static void printperm(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            String newInput= str.substring(0,i)+str.substring(i+1);
            printperm(newInput,ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        printperm(str,"");
    }
}
