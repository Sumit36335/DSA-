package Array2dPractice;

public class Multiplication {
    public static void main(String[] args) {
        int[][]arr1={{10,0,0},{0,20,0}};
        int[][] arr2={{1,0,1,0},{ 0,1,1,2},{1,1,0,0}};
        int [][] arr3=new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[0].length;j++)
            {
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("AFTER MULTIPLICATION");
        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[0].length;j++)
            {
                for(int k=0;k<arr1[0].length;k++)
                {
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
            System.out.println();
        }
        System.out.println("your array after multiplication");

        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[0].length;j++)
            {
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
