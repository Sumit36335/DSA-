public class ReverseDisplay {
    static  void myFunction(int[] arr,int idx)
    {
        if(idx==arr.length)return;
        myFunction(arr,idx+1);
        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        int [] arr={3,1,0,7,5};
        myFunction(arr,0);
    }
}
