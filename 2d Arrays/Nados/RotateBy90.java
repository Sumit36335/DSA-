package Array2dPractice;

public class RotateBy90 {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
            for(int i=0;i< arr.length;i++)
            {
                for(int j=0;j<i;j++)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            for(int i=0;i< arr.length;i++)
            {
                for(int j=0;j<arr.length/2;j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][arr.length - 1-j];
                    arr[i][arr.length - 1-j] = temp;
                }
            }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        }
}
