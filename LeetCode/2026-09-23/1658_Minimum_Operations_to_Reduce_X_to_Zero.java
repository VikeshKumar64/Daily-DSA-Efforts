class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        
        int sum = 0;
        for(int i : nums) sum += i;

        if(sum < x)return -1;
        int find = sum - x;
        if (find == 0) return n;
        
        int currSum = 0;
        int longLen = 0;
        int j = 0;
        int i = 0;
        while(i < n){
            currSum = currSum + nums[i];
            while(currSum > find ){
                currSum -= nums[j];
                j++;
            }
            if(currSum == find){
                longLen = Math.max(longLen, i - j + 1);
                
            }
            i++;
        }
        return longLen == 0 ? -1 : n - longLen;
    }
}