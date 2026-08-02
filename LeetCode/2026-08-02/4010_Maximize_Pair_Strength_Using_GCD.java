class Solution {
    private int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        long ans = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                long n = gcd(nums[i], nums[j]);
                ans = Math.max(ans,((1L * nums[i] * nums[j]) / (n * n)));
            }
        }
        return ans;
    }
}