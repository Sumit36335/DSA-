public class lastIndex {
    static void myFunction(int[] arr,int idx,int val)
    {
        if(arr[idx]==val){
            System.out.println(idx);
            return;
        }
        else
        {
            myFunction(arr,idx-1,val);
        }
    }
    public static void main(String[] args) {
        int arr[]={15,11,40,4,4,9};
        myFunction(arr,arr.length-1,4);
    }
}
