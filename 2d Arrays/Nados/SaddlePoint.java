package Array2dPractice;

public class SaddlePoint {
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
        int flag=0;
        System.out.println();
        for(int i=0;i< arr1.length;i++)
        {
            flag=0;
            int smallj=0;
            for(int j=1;j<arr1[0].length;j++)
            {
                if(arr1[i][smallj]>arr1[i][j])
                {
                    smallj=j;
                }
            }
            for(int k=0;k<arr1.length;k++)
            {
                if(arr1[k][smallj]>arr1[i][smallj])
                {
                   flag=1;
                   break;
                }
            }
            if(flag==0) {

                System.out.println(arr1[i][smallj]);
                return;
            }
        }
        if(flag==1) {
            System.out.println("invalid");
        }
    }
}
