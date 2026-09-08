class Solution {
    public static int[] reverseInPlace(int[] array, int fromIndex, int toIndex) {
    int start = fromIndex;
    int end = toIndex;

    while (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        start++;
        end--;
    }

    return array;
}

    public void nextPermutation(int[] nums) {
        int id = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                id = i;
                break;
            }
        }
        if(id == -1){
            reverseInPlace(nums, 0, nums.length - 1);
            return;
        }

        for(int i = nums.length - 1; i > id; i--){
            if(nums[i] > nums[id]){
                int temp = nums[i];
                nums[i] = nums[id];
                nums[id] = temp;
                break;
            }
        }
        reverseInPlace(nums, id + 1, nums.length - 1);
    }
}