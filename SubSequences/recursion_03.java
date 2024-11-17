class Solution {
    public int func(int index,int k,int[] nums){
        if(k==0){
            return 1;
        }
        if(k < 0){
            return 0;
        }
        if(index==nums.length){
            return 0;
        }
        return func(index+1,k-nums[index],nums)+func(index+1,k,nums);
    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return func(0, k, nums);
    }
}