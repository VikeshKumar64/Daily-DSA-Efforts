class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 1 && nums[0] != 1) return 1;
        if(nums.length == 1) return nums[0] + 1;
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            max = Math.max(max,i);
            if(i > 0){
                min = Math.min(min,i);
            }
            set.add(i);
        }
        if(max == Integer.MAX_VALUE){
            max = max;
        }else max = max + 1;
        System.out.println(max+""+ min);
        for(int i = 1; i <= max; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}