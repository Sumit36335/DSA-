package Array2dPractice;

public class StateOfWakanda1 {
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
        for(int j=0;j<arr1[0].length;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<arr1.length;i++)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            else
            {
                for(int i=arr1.length-1;i>=0;i--)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();

            }

        }
    }
}
