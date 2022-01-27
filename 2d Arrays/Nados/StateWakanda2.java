package Array2dPractice;

public class StateWakanda2 {
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
        System.out.println();
        for(int g=0;g<arr1.length;g++)
        {
            for(int i=0,j=g;j<arr1.length;i++,j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
