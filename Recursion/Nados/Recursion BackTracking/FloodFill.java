public class FloodFill {
    static void function(int [][] arr,int sr,int sc,String ans,boolean visited[][])
    {
        int dr= arr.length-1;
        int dc=arr[0].length-1;
        if ((sr < 0 || sc < 0) || (sr > dr) ||(sc > dc) || (arr[sr][sc]==1) || visited[sr][sc]==true ) {
            return;
        }
        if(sr==dr&&sc==dc)
        {
            System.out.println(ans);
            return;
        }
        visited[sr][sc]=true;
        function(arr,sr-1,sc,ans+"t",visited);
        function(arr,sr,sc-1,ans+"l",visited);
        function(arr,sr+1,sc,ans+"d",visited);
        function(arr,sr,sc+1,ans+"r",visited);
        visited[sr][sc]=false;
    }
    public static void main(String[] args) {
        int [][]arr ={{0,0,0},{1,0,1},{0,0,0}};
        boolean [][]visited=new boolean[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;i<3;i++)
            {
                visited[i][j]=false;
            }
        }
        function(arr,0,0,"",visited);
    }
}
