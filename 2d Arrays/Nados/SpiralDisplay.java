package Array2dPractice;

public class SpiralDisplay {
    public static void main(String[] args) {
        int[][]arr1={{11,12,13,14},{21,22,23,24},{31,32,33,34}};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        int te= 12;
        int count=0;
        int minr=0;
        int maxr=arr1.length-1;
        int minc=0;
        int maxc=arr1[0].length-1;
        while(count<te)
        {
            for(int i=minr,j=minc;i<=maxr&&count<te;i++)
            {
                System.out.print(arr1[i][j]+"  ");
                count++;
            }
            minc++;
            for(int i=maxr,j=minc;j<=maxc&&count<te;j++)
            {
                System.out.print(arr1[i][j]+"  ");
                count++;
            }
            maxr--;
            for(int i=maxr,j=maxc;i>=minr&&count<te;i--)
            {
                System.out.print(arr1[i][j]+"  ");
                count++;
            }
            maxc--;
            for(int i=minr,j=maxc;j>=minc&&count<te;j--)
            {
                System.out.print(arr1[i][j]+"  ");
                count++;
            }
            minr++;

        }


    }
}
