class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        int freq[] = new int[51];
        for(int i = 0; i <= n-k; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i+k; j++){
                if(set.contains(nums[j])) continue;
                set.add(nums[j]);
                freq[nums[j]]++;
            }
        }
        int maxVal = -1;
        for(int i = 0; i < 51; i++){
            if(freq[i] == 1){
                maxVal = Math.max(maxVal,i);
            } 
        }
        return maxVal;
    }
}