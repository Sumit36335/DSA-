public class NQueens {
    static int check(boolean [][] arr, int row,int col)
    {
        for(int i=row-1,j=col;i>=0; i--)
        {
            if(arr[i][j]==true)
            {
                return 0;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0; i--,j--)
        {
            if(arr[i][j]==true)
            {
                return 0;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j< arr.length; i--,j++)
        {
            if(arr[i][j]==true)
            {
                return 0;
            }
        }
        return  1;
    }
     public static void  myFunction(boolean [][]arr,String ans,int row)
    {
        if(row==arr.length)
        {
            System.out.println(ans+".");
            return;
        }
        for(int col=0;col<arr[0].length;col++)
        {
            if(check(arr,row,col)==1)
            {

               arr[row][col]=true;
               myFunction(arr,ans+row+"-"+col+",",row+1);
               arr[row][col]=false;
            }
        }
    }
    public static void main(String[] args) {
        boolean [][] arr= new boolean[4][4];
        myFunction(arr,"",0);
    }
}
