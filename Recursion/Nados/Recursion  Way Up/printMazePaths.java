public class printMazePaths {
    static void printMaze(int sr,int sc,int dr,int dc,String ans,int idx)
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
        printMaze(sr,sc+1,dr,dc,ans+"h",idx+1);
        printMaze(sr+1,sc,dr,dc,ans+"v",idx+1);

    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        System.out.println("your desired maze are");
        printMaze(0,0,r-1,c-1,"",0);
    }
}
