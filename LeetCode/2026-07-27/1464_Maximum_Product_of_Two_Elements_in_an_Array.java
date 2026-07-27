class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int smax = -1;
        for(int i : nums){
            if(i > max){
                smax = max;
                max = i;
            }
            else if(smax < i) smax = i;
        }
        return (max-1) * (smax-1);
    }
}