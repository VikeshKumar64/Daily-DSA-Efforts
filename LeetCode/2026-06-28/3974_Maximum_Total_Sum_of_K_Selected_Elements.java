class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans = 0;
        Arrays.sort(nums);
        int idx = nums.length - 1; 

        while(k-- > 0){
            int num = nums[idx--];

            if(mul > 1){
                ans += (long) num * mul;
            }else{
                ans += num;
            }
            mul--;
        }
        return ans;
    }
}