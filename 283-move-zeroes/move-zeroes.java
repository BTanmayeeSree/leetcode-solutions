class Solution {
    public void moveZeroes(int[] nums) {
        int prev=0;
        for (int curr = 0; curr < nums.length; curr++) {
            if (nums[curr] != 0) {
                int temp = nums[prev];
                nums[prev] = nums[curr];
                nums[curr] = temp;
                prev++;
            }
        }
    
    }
}