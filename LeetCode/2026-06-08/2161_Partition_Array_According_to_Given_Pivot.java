class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int idx = 0;

        for(int n : nums){
            if(n < pivot) ans[idx++] = n;
        }
        for(int n : nums){
            if(n == pivot) ans[idx++] = n;
        }
        for(int n : nums){
            if(n > pivot)  ans[idx++] = n;
        }
        return ans;
    }
}