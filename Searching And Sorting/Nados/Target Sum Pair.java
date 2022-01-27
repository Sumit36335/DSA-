class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Brute force 
        // O(N^2)
       /* 
        for ( int i = 0 ; i< nums.length ; i++){
            for ( int j =i+1 ; j<nums.length ; j++){
                if ( nums[i]+nums[j]==target){
                    return new int []{i+1 , j+1};
                }
            }
        }
        return null;
      */
        //optimised using two pointer 
        
        int left = 0 , right = nums.length-1;
        
        while(left<right){
            if ( nums[left]+nums[right] == target){
                return new int []{left+1 , right+1};
            }else if ( nums[left]+nums[right] < target){
                left++;
            }else {
                right--;
            }
        }
        
        return null;
        
    }
}
