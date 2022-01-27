import java.util.ArrayList;

public class GetMazePathsJump {
    static ArrayList<String>getMazeJump(int sr,int sc ,int dr,int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base ;
        }
        ArrayList<String> ans= new ArrayList<>();
        int jump=1;
        while(sc+jump<=dc)
        {
            ArrayList<String> first= getMazeJump(sr,sc+jump,dr,dc);
            for(String i:first)
            {
                ans.add("h"+jump+i);
            }
            jump++;
        }
        jump=1;
        while(sr+jump<=dr)
        {
            ArrayList<String> first= getMazeJump(sr+jump,sc,dr,dc);
            for(String i:first)
            {
                ans.add("v"+jump+i);
            }
            jump++;
        }
        jump=1;
        while(sc+jump<=dc&&sr+jump<=dr)
        {
            ArrayList<String> first= getMazeJump(sr+jump,sc+jump,dr,dc);
            for(String i:first)
            {
                ans.add("d"+jump+i);
            }
            jump++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int r=2;
        int c=2;
        ArrayList<String> answer=getMazeJump(0,0,r-1,c-1);
        System.out.println(answer);
    }
}
