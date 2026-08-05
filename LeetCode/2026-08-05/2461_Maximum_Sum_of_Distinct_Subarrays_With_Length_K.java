class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long sum = 0;
        long currW = 0;
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;

        while(j < n){
            while(set.contains(nums[j])){
                currW -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            currW += nums[j];
            set.add(nums[j]);
            if(j-i+1 == k){
                sum = Math.max(sum, currW);

                currW -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return sum;
    }
}