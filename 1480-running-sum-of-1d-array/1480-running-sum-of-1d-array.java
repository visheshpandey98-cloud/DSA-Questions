class Solution {
    public int[] runningSum(int[] nums) {
        int fst=nums[0];
        for(int i=1;i<=nums.length-1;i++)
        {
            nums[i]=fst+nums[i];
            fst=nums[i];
        }
        return nums;
        
    }
}