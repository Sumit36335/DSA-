package Array2dPractice;

import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) {
        int[][]arr1={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }

        int s= 2;
        int r= 1;
        RingRotate(arr1,s,r);
    }

    static void RingRotate(int[][] arr,int s,int r)
    {
        int[] oneD=makeOneD(arr,s);
       rotateOneD(oneD,r);
       fill2d(arr,s,oneD);
        System.out.println("your 2d array now is :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static int[] makeOneD(int[][]arr,int s)
    {
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int size=2*(maxr-minr+1)+2*(maxc-minc+1)-4;
        int[] array=new int[size];

        int idx=0;
        for(int i=minr, j=minc;i<=maxr;i++)
        {
            array[idx]=arr[i][j];
            idx++;
        }

        for(int i=maxr, j=minc+1;j<=maxc;j++)
        {
            array[idx]=arr[i][j];
            idx++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--)
        {
            array[idx]=arr[i][j];
            idx++;
        }
        for(int i=minr, j=maxc-1;j>=minc+1;j--)
        {
            array[idx]=arr[i][j];
            idx++;
        }
        return array;
    }
    static void fill2d(int[][]arr,int s,int[]oneD)
    {
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;


        int idx=0;
        for(int i=minr, j=minc;i<=maxr;i++)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }

        for(int i=maxr, j=minc+1;j<=maxc;j++)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }
        for(int i=minr, j=maxc-1;j>=minc+1;j--)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }

    }
    static void reverse(int[]oneD,int idx1,int idx2)
    {
        while(idx1<idx2)
        {
            int temp=oneD[idx1];
            oneD[idx1]=oneD[idx2];
            oneD[idx2]=temp;
            idx1++;
            idx2--;
        }
    }
    static void rotateOneD(int[]oneD,int r)
    {
        r=r%oneD.length;
        if(r<0)r+=oneD.length;
        reverse(oneD,0,oneD.length-1-r);
        reverse(oneD,oneD.length-r,oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }

}
