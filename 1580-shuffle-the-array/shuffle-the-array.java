class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] ans=new int[n*2];
       int in=0;
       for(int i=0;i<n;i++){
        ans[in++]=nums[i];
        ans[in++]=nums[i+n];
       } 
       return ans;
    }
}