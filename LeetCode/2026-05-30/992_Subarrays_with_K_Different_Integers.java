class Solution {
    public int fun(int nums[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;
        for(int i = 0; i < nums.length; i++){
            int c = nums[i];
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.size() > k){
                map.put(nums[l], map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
            count += i - l + 1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k) - fun(nums,k-1);
    }
}