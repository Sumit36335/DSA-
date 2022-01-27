import java.util.ArrayList;

public class Getkpc
{
    static String dtoc[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static ArrayList<String> getkpc(String str,int idx)
    {
        if(idx==str.length())
        {
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> small=getkpc(str,idx+1);
        ArrayList<String> answer= new ArrayList<>();
        for(Character ch:dtoc[str.charAt(idx)-'0'].toCharArray())
        {
           for(String i:small)
           {
               answer.add(ch+i);
           }
        }
        return answer;
    }
    public static void main(String[] args) {
        String arr= "78";
        System.out.println(arr);
        ArrayList<String>result= getkpc(arr,0);
        System.out.println("Your Subsequence Are :");
        System.out.println(result);
    }
}
