class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int answer = Integer.MAX_VALUE;

        while(start <= end){
            int mid = (start + end )/2;
            if(nums[mid] > nums[end]){
                answer = Math.min(answer, nums[end]);
                start = mid + 1;
            }else if(nums[mid] < nums[end]){
                answer = Math.min(answer, nums[mid]);
                end = mid - 1;
            }else{
                answer = Math.min(answer, nums[end]);
                end--;
            }
           
        }
        return answer;
    }
}