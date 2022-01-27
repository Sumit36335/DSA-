public class max_of_Array
{
    static void max(int[] arr,int max,int idx)
    {
        if(idx==arr.length-1)
        {
            System.out.println(max);
            return;
        }
        else  if(arr[idx]>max)
        {
            max(arr,arr[idx],idx+1);
        }
        else
        {
            max(arr,max,idx+1);
        }
    }
    public static void main(String[] args) {
        int [] arr ={30,10,00,708,500};
        max(arr,Integer.MIN_VALUE,0);
    }
}
