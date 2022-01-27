import java.lang.reflect.Array;
import java.util.ArrayList;

public class displayArray {
    static  void myFunction(int[] arr,int idx)
    {
        if(idx==arr.length)return;
        System.out.println(arr[idx]);
        myFunction(arr,idx+1);
    }
    public static void main(String[] args) {
        int [] arr={3,1,0,7,5};
        myFunction(arr,0);
    }
}
