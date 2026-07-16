class Solution {
    private int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int pri[] = new int[n];
        int max = -1;
        for(int i = 0; i < n; i++){
            max = Math.max(nums[i],max);
            pri[i] = gcd(max,nums[i]);
        }

        Arrays.sort(pri);

        long ans = 0;
        int i = 0, j = n-1;

        while(i < j){
            ans += gcd(pri[i],pri[j]);
            i++;
            j--;
        }
        return ans;
    }
}