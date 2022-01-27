public class Allindexes {
    static void myFunction(int[] arr,int idx,int val)
    {
        if(idx==arr.length)
        {
            return;
        }
        else if(arr[idx]==val){
            System.out.println(idx);
            myFunction(arr,idx+1,val);
        }
        else
        {
            myFunction(arr,idx+1,val);
        }
    }
    public static void main(String[] args) {
        int arr[]={15,11,40,4,4,9,4};
        myFunction(arr,0,4);
    }
}
