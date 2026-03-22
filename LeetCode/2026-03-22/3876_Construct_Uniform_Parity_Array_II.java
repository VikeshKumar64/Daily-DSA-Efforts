class Solution {
    public boolean uniformArray(int[] nums1) {
        int temp = Integer.MAX_VALUE;
        for(int i : nums1){
            temp = Math.min(temp, i);
        }
        boolean bool = true;
        if(temp%2 == 0){
            for(int i = 0; i < nums1.length; i++){
                if(nums1[i] == temp) continue;
                if(nums1[i] % 2 != 0){
                    return false;
                }
            }
        }

        return true;
    }
}