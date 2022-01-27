public class printMazePathJump {
    static void printMazejump(int sr,int sc,int dr,int dc,String ans)
    {
        if(sr==dr && sc== dc)
        {
            System.out.println(ans);
            return ;
        }
        if(sr>dr|| sc>dc)
        {
            return;
        }
        for(int jump=1;jump+sc<=dc;jump++)
        {
            printMazejump(sr,sc+jump,dr,dc,ans+"h"+jump);
        }

        for(int jump=1;jump+sr<=dr;jump++)
        {
            printMazejump(sr+jump,sc,dr,dc,ans+"v"+jump);
        }

        for(int jump=1;jump+sc<=dc&&jump+sr<=dr;jump++)
        {
            printMazejump(sr+jump,sc+jump,dr,dc,ans+"d"+jump);
        }

    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        System.out.println("your desired maze are");
        printMazejump(0,0,r-1,c-1,"");
    }
}
