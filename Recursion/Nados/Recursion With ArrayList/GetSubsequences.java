import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetSubsequences {
    static ArrayList<String> getSubsequence(String str,int idx)
    {
        if(idx==str.length())
        {
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> small=getSubsequence(str,idx+1);
        ArrayList<String> ans  =new ArrayList<>();
        for(String i:small)
        {
            ans.add(i);
        }
        for(String i:small)
        {
             ans.add(str.charAt(idx)+i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String arr= "abc";
        System.out.println(arr);
        ArrayList<String>result= getSubsequence(arr,0);
        System.out.println("Your Subsequence Are :");
        System.out.println(result);
    }
}
