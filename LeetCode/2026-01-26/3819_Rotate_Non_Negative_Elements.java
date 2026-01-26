class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int m = 0;
        for(int i : nums){
            if(i >= 0) m++;
        }
        if(m == 0) return nums;

        int pos[] = new int[m];
        int idx = 0;
        for(int x : nums){
            if(x >= 0) pos[idx++] = x;
        }

        k = k % m;
        int rotated[] = new int[m];

        for(int i = 0; i < m; i++){
            rotated[i] = pos[(i+ k + m) % m];
        }

        idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                nums[i] = rotated[idx++];
            }
        }
        return nums;
    }
}