public class TargetSumSubsets {
    static void targetSum(int [] arr,String ans,int target,int idx)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                System.out.println(ans+".");
            }
            return;
        }
        if(target<0)
        {
            return;
        }
        targetSum(arr,ans+arr[idx]+",",target-arr[idx],idx+1);
        targetSum(arr,ans,target,idx+1);
    }
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};
        int target= 60;
        targetSum(arr,"",target,0);
    }
}
