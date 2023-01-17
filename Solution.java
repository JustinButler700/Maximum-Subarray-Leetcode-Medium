class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int n : nums){
            //Whenever our sum decreases below 0, it's prefix is negative, so we will reset our subarray sum
            //This way, we only pay attention to subArrays on with more contiguous positive values.
            if(sum < 0){
                sum = 0;
            }
            //keep track of current sub array sum
            sum += n;
            max = Math.max(max, sum);
        }
        return max;
    }
}
