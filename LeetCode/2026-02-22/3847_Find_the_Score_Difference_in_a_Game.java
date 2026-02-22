class Solution {
    public int scoreDifference(int[] nums) {
        int sum = 0;
        int sum2 = 0;
        int active = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                active = 1 - active;
            }
            if((i+1) % 6 == 0){
                active = 1 - active;
            }
            if(active == 0){
                sum += nums[i];
            }else{
                sum2 += nums[i];
            }
        }
        return sum - sum2;
    }
}