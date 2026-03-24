class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int len = nums.length;
        long prifix[] = new long[len];
        long suffix[] = new long[len];
        prifix[0] = nums[0];
        suffix[len-1] = nums[len-1]; 
        for(int i = 1; i < len; i++){
            prifix[i] = Math.max(prifix[i-1],nums[i]);
        }
        for(int i = len - 2; i >= 0; i--){
            suffix[i] = Math.max(suffix[i+1],nums[i]);
        }
        for(int j = 1; j < len - 1; j++){
            long bro = (prifix[j-1] - nums[j]) * suffix[j+1];
            ans = Math.max(ans, bro);
        }
        return ans;
    }
}