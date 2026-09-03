class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int[] freq = new int[51];
        int[] result = new int[nums.length - k + 1];
        int pos = 0;
        int idx = 0;
        int rIdx = -1;


        for(int  i = 0; i < nums.length; i++) {
            if(nums[i] < 0) 
                freq[nums[i]+50]++;
            
            if(i > k-1 && nums[i-k] < 0) 
                freq[nums[i-k]+50]--;
            
            if(i >= k-1) {
                rIdx++;
                pos = x;
                idx = 0;
                while(idx < 51) {
                    pos -= freq[idx];
                    if(pos <= 0) {
                        result[rIdx] = idx - 50;
                        break;
                    }
                    idx++;
                }
            }


        }

        return result;
    }
}