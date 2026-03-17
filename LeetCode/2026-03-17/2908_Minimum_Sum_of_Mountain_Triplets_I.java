class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k =  j + 1; k < n; k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        int sum = nums[i] + nums[j] + nums[k];
                        min = Math.min(sum, min);
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}