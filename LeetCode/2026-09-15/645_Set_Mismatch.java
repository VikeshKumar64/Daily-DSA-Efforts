class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        for(int i = 0; i < n; i++){
            arr[nums[i]]++;
        }
        int ans[] = new int[2];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 2) ans[0] = i;
            if(arr[i] == 0) ans[1] = i;
        }
        return ans;
    }
}