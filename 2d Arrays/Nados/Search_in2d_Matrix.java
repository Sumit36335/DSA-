package Array2dPractice;

public class Search_in2d_Matrix {
    public static void main(String[] args) {
        int[][]arr={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int n=43;
        System.out.println();
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length&&j>=0)
        {
            if(arr[i][j]==n)
            {
                System.out.println(i);
                System.out.println(j);
                return;
            }

            else if(arr[i][j]<n)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
    }
}
