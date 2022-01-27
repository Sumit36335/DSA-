package Array2dPractice;

public class ExitPoint {
    public static void main(String[] args) {
        int[][]arr={{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        int i=0,j=0;
        int dir=0;
        while(true)
        {
            dir=(dir+arr[i][j])%4;
            if(dir==0)j++;
            else if(dir==1)i++;
            else if(dir==2)j--;
            else if(dir==3)i--;
            if(i<0)
            {
                i++;
                break;
            }
            else if(j<0)
            {
                j++;
                break;
            }
            else if(i==arr.length)
            {
                i--;
                break;
            }
            else if(j==arr.length)
            {
                j--;
                break;
            }
        }
        System.out.println(i+" "+j);
    }
}
