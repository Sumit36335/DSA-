import java.util.ArrayList;

public class GetMazePaths {
    static ArrayList<String> getMaze(int sr,int sc,int dr,int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base ;
        }
        if(sc>dc||sr>dr)
        {
            ArrayList<String> base= new ArrayList<>();
            return base ;
        }
        ArrayList<String> ans=new ArrayList<>();
        ArrayList<String> hori= getMaze(sr,sc+1,dr,dc);
        for(String i:hori)
        {
            ans.add("h"+i);
        }
        ArrayList<String> ver= getMaze(sr+1,sc,dr,dc);
        for(String i:ver)
        {
            ans.add("v"+i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int r=2;
        int c=2;
        ArrayList<String> answer=getMaze(0,0,r-1,c-1);
        System.out.println(answer);
    }
}
