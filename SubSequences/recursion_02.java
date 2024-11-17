class Solution {
    public boolean solve(int index, int n, int arr[], int k){
        if(k==0){
            return true;
        }
        if(k<0){
            return false;
        }
        if(index==n){
            return false;
        }
        return (solve(index+1,n,arr,k-arr[index]) || solve(index+1,n,arr,k));
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
         int n = nums.length;
         return solve(0,n,nums,k);
    }
}