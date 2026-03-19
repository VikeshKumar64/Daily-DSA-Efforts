class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];
        ArrayList<Integer> names = new ArrayList<>();
        for(int i = 1; i < nums.length; i++){
            int prev = nums[i - 1];
            int curr = nums[i];

            for(int j = prev + 1; j < curr; j++){
                names.add(j);
            }
        }
        return names;
    }
}