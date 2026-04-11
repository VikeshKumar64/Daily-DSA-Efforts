class Solution {
    public int countCollect(int num, int target){
        int rem = 0;
        int count = 0;
        while(num > 0){
            rem = num % 10;
            if(rem == target) count++;
            num = num / 10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += countCollect(nums[i], digit);
        }
        return ans;
    }
}