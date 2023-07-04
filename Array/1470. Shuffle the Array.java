class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        for (int i = 0; i < n; i++){
            // as I want to change the every 2nd position first and the next will take care of 2nd next value
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[i + n];
        }
        return ans;
    }
}