import java.util.ArrayList;

public class printKpc {
    static String dtoc[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static void printKpc(String str, String ans, int idx)
    {
        if(idx==str.length())
        {
            System.out.println(ans);
            return;
        }
        for(Character ch :dtoc[str.charAt(idx)-'0'].toCharArray())
        {
            printKpc(str,ans+ch,idx+1);
        }
    }
    public static void main(String[] args) {
            String arr= "78";
            System.out.println(arr);
            System.out.println("Your Subsequence Are :");
            printKpc(arr,"",0);
        }
}
