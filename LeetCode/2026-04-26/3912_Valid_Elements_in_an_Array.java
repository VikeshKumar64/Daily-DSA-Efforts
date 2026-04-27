class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int prifixMax[] = new int[n];
        int suffixMax[] = new int[n];
        prifixMax[0] = nums[0];
        suffixMax[n-1] = nums[n-1];
        for(int i = 1; i < n; i++){
            prifixMax[i] = Math.max(prifixMax[i-1], nums[i]);
        }
        for(int i = n-2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], nums[i]);
        }
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n - 1) {
                ans.add(nums[i]);
                continue;
            }

            if(nums[i] > prifixMax[i-1] || nums[i] > suffixMax[i+1]) ans.add(nums[i]);
        }
        return ans;
    }
}