import java.util.Arrays;


public class MergeSort {
    static int[] merge (int [] arr,int low,int high)
    {
        if(low==high)
        {
            int []  base = new int[1];
            base[0]=arr[low];
            return base;
        }
        int mid  = (low+high)/2;
        int []  left=merge(arr,low,mid);
        int [] right = merge (arr,mid+1,high);
        int [] sorted = merge2Sorted(left,right);
        return sorted;
    }
    static int[]  merge2Sorted(int[] arr1,int[] arr2)
    {
        int i=0,j=0,k=0;
        int[] c = new int [arr1.length+arr2.length];
        while(i<arr1.length&& j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                c[k] = arr1[i];
                i++;
                k++;
            } else if(arr2[j]<arr1[i]){
                c[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length)
        {
            c[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            c[k]=arr2[j];
            j++;
            k++;
        }
        return  c;

    }
    public static void main(String[] args) {
        int [] arr={5,2,6,3,1,9,4,8,7,2,5};
        int [] s = merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(s));
    }
}
