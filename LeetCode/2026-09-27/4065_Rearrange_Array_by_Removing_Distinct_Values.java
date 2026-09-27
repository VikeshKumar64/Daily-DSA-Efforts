class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[101];
        int rans[] = new int[n];
        for(int i : nums){
            ans[i]++;
        }
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 100; j++){
                if(ans[j+1] != 0){
                    ans[j+1]--;
                    rans[k] = j+1;
                    k++;
                }
            }
        }return rans;
    }
}