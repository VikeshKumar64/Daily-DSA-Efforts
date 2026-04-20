class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        int n = nums1.length;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int j = 0; 
        int i = 0;
        while(i < n1 && j < n2){
            if(nums2[j] >= nums1[i]){
                max = Math.max(max,j-i);
                j++;
            }
           else i++;
            
        }
        return max;
    }
}