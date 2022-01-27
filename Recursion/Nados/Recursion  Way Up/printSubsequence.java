import java.util.ArrayList;

public class printSubsequence {
    static void printFunc(String str,String ans ,int idx)
    {
         if(idx== str.length())
         {
             System.out.println(ans);
             return;
         }
        char ch = str.charAt(idx);
        printFunc(str,ans+ch,idx+1);
        printFunc(str,ans,idx+1);

    }
    public static void main(String[] args) {
        String arr= "yvTA";
        System.out.println(arr);
        System.out.println("Your Subsequence Are :");
        printFunc(arr,"",0);
    }
}
