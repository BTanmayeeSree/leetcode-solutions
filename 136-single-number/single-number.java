class Solution {

    public int singleNumber(int[] nums) {

        int n = nums.length;
int re=0;
        for (int i = 0; i < n; i++) {
        re=re^nums[i];
        }
        return re;
    }
}