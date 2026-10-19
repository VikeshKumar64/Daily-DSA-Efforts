class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int less = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                less++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans.add(less++);
            }
        }
        return ans;
    }
}