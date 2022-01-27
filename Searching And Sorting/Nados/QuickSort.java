import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int [] arr,int low ,int high)
    {
        if(low>high)
        {
            return ;
        }
        int p= partition(arr[high],arr,low ,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);

    }
    public static int partition(int pivot,int [] arr,int low ,int high )
    {
        int left=low;
        int right =low;
        while(right<=high)
        {
            if(arr[right]>pivot)
            {
                right++;
            }
            else
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right++;
            }
        }
        return left-1;
    }
    public static void main(String[] args) {
        int [] arr ={7,9,4,8,3,6,2,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
