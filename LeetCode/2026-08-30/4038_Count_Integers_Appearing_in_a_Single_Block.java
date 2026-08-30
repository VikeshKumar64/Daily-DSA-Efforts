class Solution {
    public int countSpecialIntegers(int[] nums) {
        boolean saw[] = new boolean[101];
        boolean bad[] = new boolean[101];
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                if(saw[nums[i]]) {
                    if (!bad[nums[i]]) {
                        bad[nums[i]] = true;
                        ans--;
                    }
                }
                else{
                    saw[nums[i]] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}