class Solution {
    public static int getDigitSum(int number) {
    int sum = 0;
    number = Math.abs(number); 
    
    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }
    return sum;
}
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            ans = Math.min(ans, getDigitSum(nums[i]));
        }
        return ans;
    }
}