class Solution {
    public int missingNumber(int[] nums) {
        int s = nums.length;
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
        }
        int temp = (s *(s+1))/2;
        return temp-sum;
    }
}