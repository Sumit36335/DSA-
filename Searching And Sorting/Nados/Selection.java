import java.util.Arrays;

public class Selection {
    static  void selectionSort(int []arr)
    {
        int n =arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= {5,9,8,1,2};
        selectionSort(arr);
        System.out.println("Your Array After Sort");
        System.out.println(Arrays.toString(arr));
    }

}
