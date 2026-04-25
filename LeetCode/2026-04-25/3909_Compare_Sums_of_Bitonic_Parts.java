class Solution {
    public int compareBitonicSums(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < nums[mid + 1]) start = mid + 1;
            else end = mid;
        }
        long assend = 0;
        long desc = 0;
        for(int i = 0; i <= start; i++){
            assend += nums[i];
        }
        for(int i = start; i < nums.length; i++){
            desc += nums[i];
        }
        if(assend > desc) return 0;
        else if(assend == desc) return -1;
        else return 1;
    }
}