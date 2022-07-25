class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int del = 0;
        int pre = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pre) {
                del++;
                continue;
            }
            
            if (divisible(numsDivide, nums[i]))
                return del;
            else
                del++;
            pre = nums[i];
        }
        return del == nums.length ? -1 : del;
    }
    
    private boolean divisible(int[] numsDivide, int x) {
        for (int n : numsDivide) {
            if (n % x != 0) return false;
        }
        return true;
    }
}