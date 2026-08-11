class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 1) return nums[0]+1;
        HashSet<Integer> set = new HashSet<>();

        int sum = nums[0];
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 1){
                while(!set.isEmpty()){
                    if(set.contains(sum)) sum++;
                    else return sum;
                }
            }
            else{
                sum += nums[i];
            }
        }
        return sum;
    }
}