package Array;

import java.util.Scanner;

public class barChartPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int rows=maxele(arr);
        int col=n;
        for(int i=rows-1;i>=0;i--)
        {
            for(int j=0;j<col;j++)
            {
                if(i<arr[j])
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
    public static int maxele(int[] arr)
    {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            res=Math.max(arr[i],res);
        }
        return res;
    }
}
